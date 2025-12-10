package th.p047co.dtac.android.dtacone.manager.locale;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import androidx.annotation.StringRes;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

@Singleton
/* renamed from: th.co.dtac.android.dtacone.manager.locale.LanguageService */
/* loaded from: classes7.dex */
public class LanguageService {

    /* renamed from: a */
    public Context f84943a;

    /* renamed from: b */
    public PreferencesRepository f84944b;

    /* renamed from: c */
    public RxBus f84945c;

    /* renamed from: d */
    public MessageRepository f84946d;

    /* renamed from: e */
    public RxThreadService f84947e;

    /* renamed from: f */
    public Map f84948f = new Hashtable();

    /* renamed from: g */
    public CompositeSubscription f84949g = new CompositeSubscription();

    @Inject
    public LanguageService(Application application, PreferencesRepository preferencesRepository, RxBus<Object> rxBus, MessageRepository messageRepository, RxThreadService rxThreadService) {
        this.f84943a = application;
        this.f84944b = preferencesRepository;
        this.f84945c = rxBus;
        this.f84946d = messageRepository;
        this.f84947e = rxThreadService;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19285a(LanguageService languageService, String str, Map map) {
        languageService.m19279g(str, map);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19284b(LanguageService languageService, String str, Map map) {
        languageService.m19278h(str, map);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19283c(Throwable th2) {
        m19277i(th2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m19282d(LanguageService languageService, String str, Map map) {
        languageService.m19280f(str, map);
    }

    /* renamed from: i */
    public static /* synthetic */ void m19277i(Throwable th2) {
    }

    public void cleanResource() {
        this.f84949g.clear();
    }

    public boolean containsKey(String str) {
        return this.f84948f.containsKey(str);
    }

    public void createDefaultLanguage() {
        setLanguage(m19281e(Locale.getDefault().getLanguage()));
    }

    /* renamed from: e */
    public final String m19281e(String str) {
        return this.f84944b.getString(Constant.PREF_LANGUAGE, str);
    }

    /* renamed from: f */
    public final /* synthetic */ void m19280f(String str, Map map) {
        m19276j(str);
    }

    /* renamed from: g */
    public final /* synthetic */ void m19279g(String str, Map map) {
        m19274l(str);
    }

    public String getLanguage() {
        return m19281e(Locale.getDefault().getLanguage());
    }

    public String getMessage(String str) {
        return (String) this.f84948f.get(str);
    }

    public String getMessageOrDefaultFromContext(@StringRes int i, Context context) {
        String resourceEntryName = context.getResources().getResourceEntryName(i);
        if (StringUtil.hasText(resourceEntryName)) {
            String message = getMessage(resourceEntryName);
            if (message != null) {
                return message;
            }
            return context.getString(i);
        }
        Log.w("MessageRepository", "Message id " + i + " not in language map");
        return "";
    }

    /* renamed from: h */
    public final /* synthetic */ void m19278h(String str, Map map) {
        this.f84948f.clear();
        this.f84948f = map;
        m19275k(str);
    }

    /* renamed from: j */
    public final void m19276j(String str) {
        this.f84944b.setString(Constant.PREF_LANGUAGE, str);
    }

    /* renamed from: k */
    public final void m19275k(String str) {
        this.f84945c.post(new RefreshLanguageEvent(str));
    }

    /* renamed from: l */
    public final void m19274l(String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Resources resources = this.f84943a.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public void loadLanguage() {
        setLanguage(getLanguage());
    }

    public void setLanguage(final String str) {
        this.f84949g.add(this.f84946d.loadMessage(str).doOnNext(new Action1() { // from class: Uh0
            {
                LanguageService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                LanguageService.m19282d(LanguageService.this, str, (Map) obj);
            }
        }).doOnNext(new Action1() { // from class: Vh0
            {
                LanguageService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                LanguageService.m19285a(LanguageService.this, str, (Map) obj);
            }
        }).compose(this.f84947e.applyBackground()).subscribe(new Action1() { // from class: Wh0
            {
                LanguageService.this = this;
            }

            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                LanguageService.m19284b(LanguageService.this, str, (Map) obj);
            }
        }, new Action1() { // from class: Xh0
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                LanguageService.m19283c((Throwable) obj);
            }
        }));
    }

    public void createDefaultLanguage(String str) {
        setLanguage(m19281e(str));
    }
}
