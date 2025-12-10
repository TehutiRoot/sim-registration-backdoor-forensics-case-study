package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class LocalBroadcastManager {

    /* renamed from: f */
    public static final Object f36082f = new Object();

    /* renamed from: g */
    public static LocalBroadcastManager f36083g;

    /* renamed from: a */
    public final Context f36084a;

    /* renamed from: b */
    public final HashMap f36085b = new HashMap();

    /* renamed from: c */
    public final HashMap f36086c = new HashMap();

    /* renamed from: d */
    public final ArrayList f36087d = new ArrayList();

    /* renamed from: e */
    public final Handler f36088e;

    /* renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$a */
    /* loaded from: classes2.dex */
    public class HandlerC4727a extends Handler {
        public HandlerC4727a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                LocalBroadcastManager.this.m53980a();
            }
        }
    }

    /* renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$b */
    /* loaded from: classes2.dex */
    public static final class C4728b {

        /* renamed from: a */
        public final Intent f36090a;

        /* renamed from: b */
        public final ArrayList f36091b;

        public C4728b(Intent intent, ArrayList arrayList) {
            this.f36090a = intent;
            this.f36091b = arrayList;
        }
    }

    /* renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$c */
    /* loaded from: classes2.dex */
    public static final class C4729c {

        /* renamed from: a */
        public final IntentFilter f36092a;

        /* renamed from: b */
        public final BroadcastReceiver f36093b;

        /* renamed from: c */
        public boolean f36094c;

        /* renamed from: d */
        public boolean f36095d;

        public C4729c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f36092a = intentFilter;
            this.f36093b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f36093b);
            sb.append(" filter=");
            sb.append(this.f36092a);
            if (this.f36095d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public LocalBroadcastManager(Context context) {
        this.f36084a = context;
        this.f36088e = new HandlerC4727a(context.getMainLooper());
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (f36082f) {
            try {
                if (f36083g == null) {
                    f36083g = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = f36083g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return localBroadcastManager;
    }

    /* renamed from: a */
    public void m53980a() {
        int size;
        C4728b[] c4728bArr;
        while (true) {
            synchronized (this.f36085b) {
                try {
                    size = this.f36087d.size();
                    if (size <= 0) {
                        return;
                    }
                    c4728bArr = new C4728b[size];
                    this.f36087d.toArray(c4728bArr);
                    this.f36087d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i = 0; i < size; i++) {
                C4728b c4728b = c4728bArr[i];
                int size2 = c4728b.f36091b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C4729c c4729c = (C4729c) c4728b.f36091b.get(i2);
                    if (!c4729c.f36095d) {
                        c4729c.f36093b.onReceive(this.f36084a, c4728b.f36090a);
                    }
                }
            }
        }
    }

    public void registerReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f36085b) {
            try {
                C4729c c4729c = new C4729c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f36085b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f36085b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c4729c);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f36086c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f36086c.put(action, arrayList2);
                    }
                    arrayList2.add(c4729c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean sendBroadcast(@NonNull Intent intent) {
        boolean z;
        int i;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        synchronized (this.f36085b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f36084a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                if ((intent.getFlags() & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Resolving type ");
                    sb.append(resolveTypeIfNeeded);
                    sb.append(" scheme ");
                    sb.append(scheme);
                    sb.append(" of intent ");
                    sb.append(intent);
                }
                ArrayList arrayList3 = (ArrayList) this.f36086c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Action list: ");
                        sb2.append(arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i2 = 0;
                    while (i2 < arrayList3.size()) {
                        C4729c c4729c = (C4729c) arrayList3.get(i2);
                        if (z) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Matching against filter ");
                            sb3.append(c4729c.f36092a);
                        }
                        if (c4729c.f36094c) {
                            i = i2;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = resolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i = i2;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = resolveTypeIfNeeded;
                            int match = c4729c.f36092a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("  Filter matched!  match=0x");
                                    sb4.append(Integer.toHexString(match));
                                }
                                if (arrayList == null) {
                                    arrayList4 = new ArrayList();
                                } else {
                                    arrayList4 = arrayList;
                                }
                                arrayList4.add(c4729c);
                                c4729c.f36094c = true;
                                i2 = i + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                resolveTypeIfNeeded = str2;
                            } else if (z) {
                                if (match != -4) {
                                    if (match != -3) {
                                        if (match != -2) {
                                            if (match != -1) {
                                                str3 = "unknown reason";
                                            } else {
                                                str3 = "type";
                                            }
                                        } else {
                                            str3 = "data";
                                        }
                                    } else {
                                        str3 = "action";
                                    }
                                } else {
                                    str3 = "category";
                                }
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("  Filter did not match: ");
                                sb5.append(str3);
                            }
                        }
                        arrayList4 = arrayList;
                        i2 = i + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        resolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            ((C4729c) arrayList5.get(i3)).f36094c = false;
                        }
                        this.f36087d.add(new C4728b(intent, arrayList5));
                        if (!this.f36088e.hasMessages(1)) {
                            this.f36088e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void sendBroadcastSync(@NonNull Intent intent) {
        if (sendBroadcast(intent)) {
            m53980a();
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f36085b) {
            try {
                ArrayList arrayList = (ArrayList) this.f36085b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C4729c c4729c = (C4729c) arrayList.get(size);
                    c4729c.f36095d = true;
                    for (int i = 0; i < c4729c.f36092a.countActions(); i++) {
                        String action = c4729c.f36092a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f36086c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C4729c c4729c2 = (C4729c) arrayList2.get(size2);
                                if (c4729c2.f36093b == broadcastReceiver) {
                                    c4729c2.f36095d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f36086c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}