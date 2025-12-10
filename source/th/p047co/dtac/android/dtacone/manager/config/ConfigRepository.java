package th.p047co.dtac.android.dtacone.manager.config;

import android.database.Cursor;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import p046rx.Observable;
import p046rx.functions.Func1;
import th.p047co.dtac.android.dtacone.manager.config.ConfigRepository;

@Singleton
/* renamed from: th.co.dtac.android.dtacone.manager.config.ConfigRepository */
/* loaded from: classes7.dex */
public class ConfigRepository {

    /* renamed from: a */
    public final String f84907a = "configs";

    /* renamed from: b */
    public final String f84908b = "SELECT * FROM configs";

    /* renamed from: c */
    public final int f84909c = 0;

    /* renamed from: d */
    public final int f84910d = 1;

    /* renamed from: e */
    public BriteDatabase f84911e;

    /* renamed from: f */
    public BriteDatabase f84912f;

    @Inject
    public ConfigRepository(@Named("languages.sqlite") BriteDatabase briteDatabase, @Named("location.sqlite") BriteDatabase briteDatabase2) {
        this.f84911e = briteDatabase;
        this.f84912f = briteDatabase2;
    }

    /* renamed from: a */
    public static /* synthetic */ Map m19332a(ConfigRepository configRepository, SqlBrite.Query query) {
        return configRepository.m19331b(query);
    }

    /* renamed from: b */
    public final /* synthetic */ Map m19331b(SqlBrite.Query query) {
        Cursor run = query.run();
        try {
            HashMap hashMap = new HashMap();
            while (run.moveToNext()) {
                hashMap.put(run.getString(0), run.getString(1));
            }
            run.close();
            return hashMap;
        } catch (Throwable th2) {
            if (run != null) {
                try {
                    run.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* renamed from: c */
    public final Observable m19330c(BriteDatabase briteDatabase) {
        return briteDatabase.createQuery("configs", "SELECT * FROM configs", new String[0]).map(new Func1() { // from class: xw
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return ConfigRepository.m19332a(ConfigRepository.this, (SqlBrite.Query) obj);
            }
        });
    }

    public Observable<Map<String, String>> loadConfig() {
        return m19330c(this.f84911e);
    }

    public Observable<Map<String, String>> loadLocationConfig() {
        return m19330c(this.f84912f);
    }

    public void reloadDatable() {
        this.f84911e.close();
    }

    public void reloadLocationDatabase() {
        this.f84912f.close();
    }
}
