package org.apache.http;

/* loaded from: classes6.dex */
public interface ExceptionLogger {
    public static final ExceptionLogger NO_OP = new C12555a();
    public static final ExceptionLogger STD_ERR = new C12556b();

    /* renamed from: org.apache.http.ExceptionLogger$a */
    /* loaded from: classes6.dex */
    public static class C12555a implements ExceptionLogger {
        @Override // org.apache.http.ExceptionLogger
        public void log(Exception exc) {
        }
    }

    /* renamed from: org.apache.http.ExceptionLogger$b */
    /* loaded from: classes6.dex */
    public static class C12556b implements ExceptionLogger {
        @Override // org.apache.http.ExceptionLogger
        public void log(Exception exc) {
            exc.printStackTrace();
        }
    }

    void log(Exception exc);
}
