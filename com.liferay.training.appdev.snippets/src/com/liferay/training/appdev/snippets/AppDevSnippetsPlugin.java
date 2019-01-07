
package com.liferay.training.appdev.snippets;

import com.liferay.ide.core.util.CoreUtil;
import com.liferay.ide.ui.snippets.util.SnippetsUtil;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class AppDevSnippetsPlugin extends AbstractUIPlugin implements IStartup {

	public static final String FIRST_LAUNCH_COMPLETE = "FIRST_LAUNCH_COMPLETE";

	// The plug-in ID
	public static final String PLUGIN_ID = "com.liferay.training.developer.snippets"; //$NON-NLS-1$

	// The shared instance
	private static AppDevSnippetsPlugin plugin;

	public static IStatus createErrorStatus( String msg, Exception e ) {
		return new Status( IStatus.ERROR, PLUGIN_ID, msg, e );
	}

	public static IStatus createInfoStatus( String msg ) {
		return new Status( IStatus.INFO, PLUGIN_ID, msg, null );
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static AppDevSnippetsPlugin getDefault() {
		return plugin;
	}

	public static void log( IStatus status ) {
		getDefault().getLog().log( status );
	}

	public static void logError( String msg, Exception ex ) {
		log( createErrorStatus( msg, ex ) );
	}

	public static void logInfo( String msg ) {
		log( createInfoStatus( msg ) );
	}

	/**
	 * The constructor
	 */
	public AppDevSnippetsPlugin() {
	}

	public void earlyStartup() {
		if ( isFirstLaunch() ) {

			boolean success = importSnippets();

			if ( success ) {
				getPreferences().putBoolean( FIRST_LAUNCH_COMPLETE, true );
			}
		}

	}

	public IEclipsePreferences getPreferences() {
		return new InstanceScope().getNode( PLUGIN_ID );
	}

	public boolean importSnippets() {
		try {
			URL entry = getDefault().getBundle().getEntry( "snippets" );
			URL snippetsFolderPath = FileLocator.toFileURL( entry );
			File snippetsDir = new File( snippetsFolderPath.getFile() );

			if ( snippetsDir.exists() && snippetsDir.isDirectory() ) {
				File[] snippetFiles = snippetsDir.listFiles( new FilenameFilter() {

					public boolean accept( File dir, String name ) {
						return name != null && name.endsWith( ".xml" );
					}

				} );

				Arrays.sort(snippetFiles, new Comparator<File>() {
					public int compare(File o1, File o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				
				if ( !CoreUtil.isNullOrEmpty( snippetFiles ) ) {
					for ( File snippetFile : snippetFiles ) {

						SnippetsUtil.importSnippetsFromFile( snippetFile );
						logInfo( "Snippet file imported: " + snippetFile );
					}
				}
			}

		}
		catch ( Exception e ) {
			logError( "Could not import snippets.", e );
			return false;
		}

		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start( BundleContext context ) throws Exception {
		super.start( context );
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop( BundleContext context ) throws Exception {
		plugin = null;
		super.stop( context );
	}

	private boolean isFirstLaunch() {
		IScopeContext[] scopes = new IScopeContext[] { new InstanceScope() };

		return !( Platform.getPreferencesService().getBoolean( PLUGIN_ID, FIRST_LAUNCH_COMPLETE, false, scopes ) );
	}

}
