package th.p047co.dtac.android.dtacone.manager.locale;

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
import th.p047co.dtac.android.dtacone.manager.locale.MessageRepository;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

@Singleton
/* renamed from: th.co.dtac.android.dtacone.manager.locale.MessageRepository */
/* loaded from: classes7.dex */
public class MessageRepository {

    /* renamed from: a */
    public BriteDatabase f84955a;

    @Inject
    public MessageRepository(@Named("languages.sqlite") BriteDatabase briteDatabase) {
        this.f84955a = briteDatabase;
    }

    /* renamed from: a */
    public static /* synthetic */ Map m19273a(MessageRepository messageRepository, String str, SqlBrite.Query query) {
        return messageRepository.m19271c(str, query);
    }

    /* renamed from: b */
    public final int m19272b(String str) {
        str.hashCode();
        if (!str.equals(LanguageSupport.LANG_EN)) {
            if (!str.equals(LanguageSupport.LANG_ZH)) {
                return 1;
            }
            return 3;
        }
        return 2;
    }

    /* renamed from: c */
    public final /* synthetic */ Map m19271c(String str, SqlBrite.Query query) {
        Cursor run = query.run();
        try {
            HashMap hashMap = new HashMap();
            while (run.moveToNext()) {
                hashMap.put(run.getString(0), run.getString(m19272b(str)));
            }
            return hashMap;
        } finally {
            run.close();
        }
    }

    public Observable<Map<String, String>> loadMessage(final String str) {
        return this.f84955a.createQuery("messages", "SELECT * FROM messages", new String[0]).map(new Func1() { // from class: os0
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return MessageRepository.m19273a(MessageRepository.this, str, (SqlBrite.Query) obj);
            }
        });
    }
}
