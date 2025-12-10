package io.realm.internal;

import android.content.Context;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsSharedRealm;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class ObjectServerFacade {
    public static final int SYNC_CONFIG_OPTIONS = 19;

    /* renamed from: a */
    public static final ObjectServerFacade f66742a = new ObjectServerFacade();

    /* renamed from: b */
    public static ObjectServerFacade f66743b;

    /* loaded from: classes5.dex */
    public interface RealmCacheAccessor {
        Realm createRealmOrGetFromCache(RealmConfiguration realmConfiguration, OsSharedRealm.VersionID versionID);
    }

    /* loaded from: classes5.dex */
    public interface RealmInstanceFactory {
        Realm createInstance(OsSharedRealm osSharedRealm);
    }

    static {
        f66743b = null;
        try {
            f66743b = (ObjectServerFacade) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e);
        } catch (InstantiationException e2) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e2);
        } catch (NoSuchMethodException e3) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e4.getTargetException());
        }
    }

    public static ObjectServerFacade getFacade(boolean z) {
        if (z) {
            return f66743b;
        }
        return f66742a;
    }

    public static ObjectServerFacade getSyncFacadeIfPossible() {
        ObjectServerFacade objectServerFacade = f66743b;
        if (objectServerFacade != null) {
            return objectServerFacade;
        }
        return f66742a;
    }

    public void checkFlexibleSyncEnabled(RealmConfiguration realmConfiguration) {
    }

    public void createNativeSyncSession(RealmConfiguration realmConfiguration) {
    }

    public void downloadInitialFlexibleSyncData(Realm realm, RealmConfiguration realmConfiguration) {
    }

    public void downloadInitialRemoteChanges(RealmConfiguration realmConfiguration) {
    }

    public Object[] getSyncConfigurationOptions(RealmConfiguration realmConfiguration) {
        return new Object[19];
    }

    public String getSyncServerCertificateAssetName(RealmConfiguration realmConfiguration) {
        return null;
    }

    public String getSyncServerCertificateFilePath(RealmConfiguration realmConfiguration) {
        return null;
    }

    public void initialize(Context context, String str, RealmCacheAccessor realmCacheAccessor, RealmInstanceFactory realmInstanceFactory) {
    }

    public void realmClosed(RealmConfiguration realmConfiguration) {
    }

    public boolean wasDownloadInterrupted(Throwable th2) {
        return false;
    }

    public void wrapObjectStoreSessionIfRequired(OsRealmConfig osRealmConfig) {
    }
}