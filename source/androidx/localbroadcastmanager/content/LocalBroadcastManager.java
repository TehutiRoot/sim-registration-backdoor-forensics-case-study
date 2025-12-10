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
    public static final Object f35994f = new Object();

    /* renamed from: g */
    public static LocalBroadcastManager f35995g;

    /* renamed from: a */
    public final Context f35996a;

    /* renamed from: b */
    public final HashMap f35997b = new HashMap();

    /* renamed from: c */
    public final HashMap f35998c = new HashMap();

    /* renamed from: d */
    public final ArrayList f35999d = new ArrayList();

    /* renamed from: e */
    public final Handler f36000e;

    /* renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$a */
    /* loaded from: classes2.dex */
    public class HandlerC4745a extends Handler {
        public HandlerC4745a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                LocalBroadcastManager.this.m54029a();
            }
        }
    }

    /* renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$b */
    /* loaded from: classes2.dex */
    public static final class C4746b {

        /* renamed from: a */
        public final Intent f36002a;

        /* renamed from: b */
        public final ArrayList f36003b;

        public C4746b(Intent intent, ArrayList arrayList) {
            this.f36002a = intent;
            this.f36003b = arrayList;
        }
    }

    /* renamed from: androidx.localbroadcastmanager.content.LocalBroadcastManager$c */
    /* loaded from: classes2.dex */
    public static final class C4747c {

        /* renamed from: a */
        public final IntentFilter f36004a;

        /* renamed from: b */
        public final BroadcastReceiver f36005b;

        /* renamed from: c */
        public boolean f36006c;

        /* renamed from: d */
        public boolean f36007d;

        public C4747c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f36004a = intentFilter;
            this.f36005b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f36005b);
            sb.append(" filter=");
            sb.append(this.f36004a);
            if (this.f36007d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public LocalBroadcastManager(Context context) {
        this.f35996a = context;
        this.f36000e = new HandlerC4745a(context.getMainLooper());
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (f35994f) {
            try {
                if (f35995g == null) {
                    f35995g = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = f35995g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return localBroadcastManager;
    }

    /* renamed from: a */
    public void m54029a() {
        int size;
        C4746b[] c4746bArr;
        while (true) {
            synchronized (this.f35997b) {
                try {
                    size = this.f35999d.size();
                    if (size <= 0) {
                        return;
                    }
                    c4746bArr = new C4746b[size];
                    this.f35999d.toArray(c4746bArr);
                    this.f35999d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i = 0; i < size; i++) {
                C4746b c4746b = c4746bArr[i];
                int size2 = c4746b.f36003b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C4747c c4747c = (C4747c) c4746b.f36003b.get(i2);
                    if (!c4747c.f36007d) {
                        c4747c.f36005b.onReceive(this.f35996a, c4746b.f36002a);
                    }
                }
            }
        }
    }

    public void registerReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f35997b) {
            try {
                C4747c c4747c = new C4747c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f35997b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f35997b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c4747c);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f35998c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f35998c.put(action, arrayList2);
                    }
                    arrayList2.add(c4747c);
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
        synchronized (this.f35997b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f35996a.getContentResolver());
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
                ArrayList arrayList3 = (ArrayList) this.f35998c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Action list: ");
                        sb2.append(arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i2 = 0;
                    while (i2 < arrayList3.size()) {
                        C4747c c4747c = (C4747c) arrayList3.get(i2);
                        if (z) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Matching against filter ");
                            sb3.append(c4747c.f36004a);
                        }
                        if (c4747c.f36006c) {
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
                            int match = c4747c.f36004a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
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
                                arrayList4.add(c4747c);
                                c4747c.f36006c = true;
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
                            ((C4747c) arrayList5.get(i3)).f36006c = false;
                        }
                        this.f35999d.add(new C4746b(intent, arrayList5));
                        if (!this.f36000e.hasMessages(1)) {
                            this.f36000e.sendEmptyMessage(1);
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
            m54029a();
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f35997b) {
            try {
                ArrayList arrayList = (ArrayList) this.f35997b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C4747c c4747c = (C4747c) arrayList.get(size);
                    c4747c.f36007d = true;
                    for (int i = 0; i < c4747c.f36004a.countActions(); i++) {
                        String action = c4747c.f36004a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f35998c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C4747c c4747c2 = (C4747c) arrayList2.get(size2);
                                if (c4747c2.f36005b == broadcastReceiver) {
                                    c4747c2.f36007d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f35998c.remove(action);
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
