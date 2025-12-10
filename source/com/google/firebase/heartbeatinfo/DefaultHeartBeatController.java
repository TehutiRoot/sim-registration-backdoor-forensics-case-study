package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.core.p005os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {

    /* renamed from: a */
    public final Provider f55448a;

    /* renamed from: b */
    public final Context f55449b;

    /* renamed from: c */
    public final Provider f55450c;

    /* renamed from: d */
    public final Set f55451d;

    /* renamed from: e */
    public final Executor f55452e;

    public DefaultHeartBeatController(final Context context, final String str, Set set, Provider provider, Executor executor) {
        this(new Provider() { // from class: yE
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return DefaultHeartBeatController.m38727b(context, str);
            }
        }, set, executor, provider, context);
    }

    /* renamed from: a */
    public static /* synthetic */ String m38728a(DefaultHeartBeatController defaultHeartBeatController) {
        return defaultHeartBeatController.m38723f();
    }

    /* renamed from: b */
    public static /* synthetic */ E70 m38727b(Context context, String str) {
        return m38722g(context, str);
    }

    /* renamed from: c */
    public static /* synthetic */ DefaultHeartBeatController m38726c(Qualified qualified, ComponentContainer componentContainer) {
        return m38724e(qualified, componentContainer);
    }

    @NonNull
    public static Component<DefaultHeartBeatController> component() {
        final Qualified qualified = Qualified.qualified(Background.class, Executor.class);
        return Component.builder(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).add(Dependency.required(Context.class)).add(Dependency.required(FirebaseApp.class)).add(Dependency.setOf(HeartBeatConsumer.class)).add(Dependency.requiredProvider(UserAgentPublisher.class)).add(Dependency.required(qualified)).factory(new ComponentFactory() { // from class: wE
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultHeartBeatController.m38726c(Qualified.this, componentContainer);
            }
        }).build();
    }

    /* renamed from: d */
    public static /* synthetic */ Void m38725d(DefaultHeartBeatController defaultHeartBeatController) {
        return defaultHeartBeatController.m38721h();
    }

    /* renamed from: e */
    public static /* synthetic */ DefaultHeartBeatController m38724e(Qualified qualified, ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getPersistenceKey(), componentContainer.setOf(HeartBeatConsumer.class), componentContainer.getProvider(UserAgentPublisher.class), (Executor) componentContainer.get(qualified));
    }

    /* renamed from: g */
    public static /* synthetic */ E70 m38722g(Context context, String str) {
        return new E70(context, str);
    }

    /* renamed from: f */
    public final /* synthetic */ String m38723f() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                E70 e70 = (E70) this.f55448a.get();
                List m68541c = e70.m68541c();
                e70.m68542b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < m68541c.size(); i++) {
                    HeartBeatResult heartBeatResult = (HeartBeatResult) m68541c.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", heartBeatResult.getUserAgent());
                    jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.getUsedDates()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put(ClientCookie.VERSION_ATTR, "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public synchronized HeartBeatInfo.HeartBeat getHeartBeatCode(@NonNull String str) {
        long currentTimeMillis = System.currentTimeMillis();
        E70 e70 = (E70) this.f55448a.get();
        if (e70.m68535i(currentTimeMillis)) {
            e70.m68537g();
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> getHeartBeatsHeader() {
        if (!UserManagerCompat.isUserUnlocked(this.f55449b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f55452e, new Callable() { // from class: vE
            {
                DefaultHeartBeatController.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatController.m38728a(DefaultHeartBeatController.this);
            }
        });
    }

    /* renamed from: h */
    public final /* synthetic */ Void m38721h() {
        synchronized (this) {
            ((E70) this.f55448a.get()).m68533k(System.currentTimeMillis(), ((UserAgentPublisher) this.f55450c.get()).getUserAgent());
        }
        return null;
    }

    public Task<Void> registerHeartBeat() {
        if (this.f55451d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!UserManagerCompat.isUserUnlocked(this.f55449b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f55452e, new Callable() { // from class: xE
            {
                DefaultHeartBeatController.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatController.m38725d(DefaultHeartBeatController.this);
            }
        });
    }

    public DefaultHeartBeatController(Provider provider, Set set, Executor executor, Provider provider2, Context context) {
        this.f55448a = provider;
        this.f55451d = set;
        this.f55452e = executor;
        this.f55450c = provider2;
        this.f55449b = context;
    }
}
