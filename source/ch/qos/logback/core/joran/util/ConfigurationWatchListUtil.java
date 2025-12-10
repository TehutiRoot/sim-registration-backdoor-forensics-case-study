package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import java.io.PrintStream;
import java.net.URL;

/* loaded from: classes.dex */
public class ConfigurationWatchListUtil {

    /* renamed from: a */
    public static final ConfigurationWatchListUtil f39829a = new ConfigurationWatchListUtil();

    /* renamed from: a */
    public static void m51487a(Context context, String str) {
        m51486b(context, new InfoStatus(str, f39829a));
    }

    public static void addToWatchList(Context context, URL url) {
        ConfigurationWatchList configurationWatchList = getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            m51485c(context, "Null ConfigurationWatchList. Cannot add " + url);
            return;
        }
        m51487a(context, "Adding [" + url + "] to configuration watch list.");
        configurationWatchList.addToWatchList(url);
    }

    /* renamed from: b */
    public static void m51486b(Context context, Status status) {
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager == null) {
                return;
            }
            statusManager.add(status);
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("Null context in " + ConfigurationWatchList.class.getName());
    }

    /* renamed from: c */
    public static void m51485c(Context context, String str) {
        m51486b(context, new WarnStatus(str, f39829a));
    }

    public static ConfigurationWatchList getConfigurationWatchList(Context context) {
        if (context == null) {
            return null;
        }
        return (ConfigurationWatchList) context.getObject(CoreConstants.CONFIGURATION_WATCH_LIST);
    }

    public static URL getMainWatchURL(Context context) {
        ConfigurationWatchList configurationWatchList = getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            return null;
        }
        return configurationWatchList.getMainURL();
    }

    public static void registerConfigurationWatchList(Context context, ConfigurationWatchList configurationWatchList) {
        context.putObject(CoreConstants.CONFIGURATION_WATCH_LIST, configurationWatchList);
    }

    public static void setMainWatchURL(Context context, URL url) {
        if (context == null) {
            return;
        }
        ConfigurationWatchList configurationWatchList = getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            configurationWatchList = new ConfigurationWatchList();
            configurationWatchList.setContext(context);
            context.putObject(CoreConstants.CONFIGURATION_WATCH_LIST, configurationWatchList);
        } else {
            configurationWatchList.clear();
        }
        configurationWatchList.setMainURL(url);
    }
}
