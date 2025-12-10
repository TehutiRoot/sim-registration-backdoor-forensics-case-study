package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

/* renamed from: dq */
/* loaded from: classes6.dex */
public class C10106dq implements InvocationHandler {

    /* renamed from: b */
    public static final Constructor f61330b;

    /* renamed from: a */
    public final HttpResponse f61331a;

    static {
        try {
            f61330b = Proxy.getProxyClass(C10106dq.class.getClassLoader(), CloseableHttpResponse.class).getConstructor(InvocationHandler.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    public C10106dq(HttpResponse httpResponse) {
        this.f61331a = httpResponse;
    }

    /* renamed from: b */
    public static CloseableHttpResponse m31631b(HttpResponse httpResponse) {
        try {
            return (CloseableHttpResponse) f61330b.newInstance(new C10106dq(httpResponse));
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* renamed from: a */
    public void m31632a() {
        EntityUtils.consume(this.f61331a.getEntity());
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getName().equals("close")) {
            m31632a();
            return null;
        }
        try {
            return method.invoke(this.f61331a, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }
}
