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
public class C10098dq implements InvocationHandler {

    /* renamed from: b */
    public static final Constructor f61384b;

    /* renamed from: a */
    public final HttpResponse f61385a;

    static {
        try {
            f61384b = Proxy.getProxyClass(C10098dq.class.getClassLoader(), CloseableHttpResponse.class).getConstructor(InvocationHandler.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    public C10098dq(HttpResponse httpResponse) {
        this.f61385a = httpResponse;
    }

    /* renamed from: b */
    public static CloseableHttpResponse m31757b(HttpResponse httpResponse) {
        try {
            return (CloseableHttpResponse) f61384b.newInstance(new C10098dq(httpResponse));
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* renamed from: a */
    public void m31758a() {
        EntityUtils.consume(this.f61385a.getEntity());
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getName().equals("close")) {
            m31758a();
            return null;
        }
        try {
            return method.invoke(this.f61385a, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }
}