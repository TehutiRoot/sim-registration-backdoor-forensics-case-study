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
    public final String f85017a = "configs";

    /* renamed from: b */
    public final String f85018b = "SELECT * FROM configs";

    /* renamed from: c */
    public final int f85019c = 0;

    /* renamed from: d */
    public final int f85020d = 1;

    /* renamed from: e */
    public BriteDatabase f85021e;

    /* renamed from: f */
    public BriteDatabase f85022f;

    @Inject
    public ConfigRepository(@Named("languages.sqlite") BriteDatabase briteDatabase, @Named("location.sqlite") BriteDatabase briteDatabase2) {
        this.f85021e = briteDatabase;
        this.f85022f = briteDatabase2;
    }

    /* renamed from: b */
    public final /* synthetic */ Map m19499b(SqlBrite.Query query) {
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
    public final Observable m19498c(BriteDatabase briteDatabase) {
        return briteDatabase.createQuery("configs", "SELECT * FROM configs", new String[0]).map(new Func1() { // from class: xw
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Map m19499b;
                m19499b = ConfigRepository.this.m19499b((SqlBrite.Query) obj);
                return m19499b;
            }
        });
    }

    public Observable<Map<String, String>> loadConfig() {
        return m19498c(this.f85021e);
    }

    public Observable<Map<String, String>> loadLocationConfig() {
        return m19498c(this.f85022f);
    }

    public void reloadDatable() {
        this.f85021e.close();
    }

    public void reloadLocationDatabase() {
        this.f85022f.close();
    }
}