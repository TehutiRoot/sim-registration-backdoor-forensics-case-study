package com.chuckerteam.chucker.internal.data.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.entity.HttpTransactionTuple;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public final class HttpTransactionDao_Impl implements HttpTransactionDao {

    /* renamed from: a */
    public final RoomDatabase f42904a;

    /* renamed from: b */
    public final EntityInsertionAdapter f42905b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter f42906c;

    /* renamed from: d */
    public final SharedSQLiteStatement f42907d;

    /* renamed from: e */
    public final SharedSQLiteStatement f42908e;

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$a */
    /* loaded from: classes3.dex */
    public class CallableC5960a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f42909a;

        public CallableC5960a(RoomSQLiteQuery roomSQLiteQuery) {
            this.f42909a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            Long valueOf;
            Long valueOf2;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Integer valueOf3;
            Long valueOf4;
            Long valueOf5;
            String string6;
            boolean z;
            String string7;
            Cursor query = DBUtil.query(HttpTransactionDao_Impl.this.f42904a, this.f42909a, false, null);
            try {
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(0);
                    if (query.isNull(1)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(query.getLong(1));
                    }
                    if (query.isNull(2)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(query.getLong(2));
                    }
                    if (query.isNull(3)) {
                        string = null;
                    } else {
                        string = query.getString(3);
                    }
                    if (query.isNull(4)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(4);
                    }
                    if (query.isNull(5)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(5);
                    }
                    if (query.isNull(6)) {
                        string4 = null;
                    } else {
                        string4 = query.getString(6);
                    }
                    if (query.isNull(7)) {
                        string5 = null;
                    } else {
                        string5 = query.getString(7);
                    }
                    if (query.isNull(8)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(query.getInt(8));
                    }
                    if (query.isNull(9)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(query.getLong(9));
                    }
                    if (query.isNull(10)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(query.getLong(10));
                    }
                    if (query.isNull(11)) {
                        string6 = null;
                    } else {
                        string6 = query.getString(11);
                    }
                    if (query.getInt(12) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.isNull(13)) {
                        string7 = null;
                    } else {
                        string7 = query.getString(13);
                    }
                    arrayList.add(new HttpTransactionTuple(j, valueOf, valueOf2, string, string2, string3, string4, string5, valueOf3, valueOf4, valueOf5, string6, z, string7));
                }
                return arrayList;
            } finally {
                query.close();
            }
        }

        public void finalize() {
            this.f42909a.release();
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$b */
    /* loaded from: classes3.dex */
    public class CallableC5961b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f42911a;

        public CallableC5961b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f42911a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public HttpTransaction call() {
            HttpTransaction httpTransaction;
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            Long valueOf4;
            String string9;
            int i;
            String string10;
            int i2;
            Long valueOf5;
            int i3;
            String string11;
            int i4;
            int i5;
            boolean z;
            Integer valueOf6;
            int i6;
            String string12;
            int i7;
            String string13;
            int i8;
            Long valueOf7;
            int i9;
            String string14;
            int i10;
            String string15;
            int i11;
            Long valueOf8;
            int i12;
            String string16;
            int i13;
            int i14;
            boolean z2;
            byte[] blob;
            int i15;
            boolean z3;
            String string17;
            Cursor query = DBUtil.query(HttpTransactionDao_Impl.this.f42904a, this.f42911a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requestDate");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "responseDate");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "tookMs");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "protocol");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, FirebaseAnalytics.Param.METHOD);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, ImagesContract.URL);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "host");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, ClientCookie.PATH_ATTR);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "scheme");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "responseTlsVersion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "responseCipherSuite");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "requestPayloadSize");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "requestContentType");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "requestHeaders");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "requestHeadersSize");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requestBody");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "isRequestBodyEncoded");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "responseCode");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "responseMessage");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "responsePayloadSize");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "responseContentType");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "responseHeaders");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "responseHeadersSize");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "responseBody");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "isResponseBodyEncoded");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "responseImageData");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "graphQlDetected");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "graphQlOperationName");
                if (query.moveToFirst()) {
                    long j = query.getLong(columnIndexOrThrow);
                    if (query.isNull(columnIndexOrThrow2)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(query.getLong(columnIndexOrThrow2));
                    }
                    if (query.isNull(columnIndexOrThrow3)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(query.getLong(columnIndexOrThrow3));
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(query.getLong(columnIndexOrThrow4));
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow5);
                    }
                    if (query.isNull(columnIndexOrThrow6)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow6);
                    }
                    if (query.isNull(columnIndexOrThrow7)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow7);
                    }
                    if (query.isNull(columnIndexOrThrow8)) {
                        string4 = null;
                    } else {
                        string4 = query.getString(columnIndexOrThrow8);
                    }
                    if (query.isNull(columnIndexOrThrow9)) {
                        string5 = null;
                    } else {
                        string5 = query.getString(columnIndexOrThrow9);
                    }
                    if (query.isNull(columnIndexOrThrow10)) {
                        string6 = null;
                    } else {
                        string6 = query.getString(columnIndexOrThrow10);
                    }
                    if (query.isNull(columnIndexOrThrow11)) {
                        string7 = null;
                    } else {
                        string7 = query.getString(columnIndexOrThrow11);
                    }
                    if (query.isNull(columnIndexOrThrow12)) {
                        string8 = null;
                    } else {
                        string8 = query.getString(columnIndexOrThrow12);
                    }
                    if (query.isNull(columnIndexOrThrow13)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(query.getLong(columnIndexOrThrow13));
                    }
                    if (query.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow15;
                        string9 = null;
                    } else {
                        string9 = query.getString(columnIndexOrThrow14);
                        i = columnIndexOrThrow15;
                    }
                    if (query.isNull(i)) {
                        i2 = columnIndexOrThrow16;
                        string10 = null;
                    } else {
                        string10 = query.getString(i);
                        i2 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i2)) {
                        i3 = columnIndexOrThrow17;
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(query.getLong(i2));
                        i3 = columnIndexOrThrow17;
                    }
                    if (query.isNull(i3)) {
                        i4 = columnIndexOrThrow18;
                        string11 = null;
                    } else {
                        string11 = query.getString(i3);
                        i4 = columnIndexOrThrow18;
                    }
                    if (query.getInt(i4) != 0) {
                        i5 = columnIndexOrThrow19;
                        z = true;
                    } else {
                        i5 = columnIndexOrThrow19;
                        z = false;
                    }
                    if (query.isNull(i5)) {
                        i6 = columnIndexOrThrow20;
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(query.getInt(i5));
                        i6 = columnIndexOrThrow20;
                    }
                    if (query.isNull(i6)) {
                        i7 = columnIndexOrThrow21;
                        string12 = null;
                    } else {
                        string12 = query.getString(i6);
                        i7 = columnIndexOrThrow21;
                    }
                    if (query.isNull(i7)) {
                        i8 = columnIndexOrThrow22;
                        string13 = null;
                    } else {
                        string13 = query.getString(i7);
                        i8 = columnIndexOrThrow22;
                    }
                    if (query.isNull(i8)) {
                        i9 = columnIndexOrThrow23;
                        valueOf7 = null;
                    } else {
                        valueOf7 = Long.valueOf(query.getLong(i8));
                        i9 = columnIndexOrThrow23;
                    }
                    if (query.isNull(i9)) {
                        i10 = columnIndexOrThrow24;
                        string14 = null;
                    } else {
                        string14 = query.getString(i9);
                        i10 = columnIndexOrThrow24;
                    }
                    if (query.isNull(i10)) {
                        i11 = columnIndexOrThrow25;
                        string15 = null;
                    } else {
                        string15 = query.getString(i10);
                        i11 = columnIndexOrThrow25;
                    }
                    if (query.isNull(i11)) {
                        i12 = columnIndexOrThrow26;
                        valueOf8 = null;
                    } else {
                        valueOf8 = Long.valueOf(query.getLong(i11));
                        i12 = columnIndexOrThrow26;
                    }
                    if (query.isNull(i12)) {
                        i13 = columnIndexOrThrow27;
                        string16 = null;
                    } else {
                        string16 = query.getString(i12);
                        i13 = columnIndexOrThrow27;
                    }
                    if (query.getInt(i13) != 0) {
                        i14 = columnIndexOrThrow28;
                        z2 = true;
                    } else {
                        i14 = columnIndexOrThrow28;
                        z2 = false;
                    }
                    if (query.isNull(i14)) {
                        i15 = columnIndexOrThrow29;
                        blob = null;
                    } else {
                        blob = query.getBlob(i14);
                        i15 = columnIndexOrThrow29;
                    }
                    if (query.getInt(i15) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (query.isNull(columnIndexOrThrow30)) {
                        string17 = null;
                    } else {
                        string17 = query.getString(columnIndexOrThrow30);
                    }
                    httpTransaction = new HttpTransaction(j, valueOf, valueOf2, valueOf3, string, string2, string3, string4, string5, string6, string7, string8, valueOf4, string9, string10, valueOf5, string11, z, valueOf6, string12, string13, valueOf7, string14, string15, valueOf8, string16, z2, blob, z3, string17);
                } else {
                    httpTransaction = null;
                }
                return httpTransaction;
            } finally {
                query.close();
            }
        }

        public void finalize() {
            this.f42911a.release();
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$c */
    /* loaded from: classes3.dex */
    public class CallableC5962c implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f42913a;

        public CallableC5962c(RoomSQLiteQuery roomSQLiteQuery) {
            this.f42913a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            CallableC5962c callableC5962c;
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            Long valueOf4;
            int i;
            String string9;
            String string10;
            Long valueOf5;
            String string11;
            boolean z;
            Integer valueOf6;
            String string12;
            String string13;
            Long valueOf7;
            String string14;
            String string15;
            Long valueOf8;
            String string16;
            boolean z2;
            byte[] blob;
            boolean z3;
            String string17;
            int i2;
            Cursor query = DBUtil.query(HttpTransactionDao_Impl.this.f42904a, this.f42913a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requestDate");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "responseDate");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "tookMs");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "protocol");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, FirebaseAnalytics.Param.METHOD);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, ImagesContract.URL);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "host");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, ClientCookie.PATH_ATTR);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "scheme");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "responseTlsVersion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "responseCipherSuite");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "requestPayloadSize");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "requestContentType");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "requestHeaders");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "requestHeadersSize");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requestBody");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "isRequestBodyEncoded");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "responseCode");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "responseMessage");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "responsePayloadSize");
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "responseContentType");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "responseHeaders");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "responseHeadersSize");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "responseBody");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "isResponseBodyEncoded");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "responseImageData");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "graphQlDetected");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "graphQlOperationName");
                    int i3 = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j = query.getLong(columnIndexOrThrow);
                        if (query.isNull(columnIndexOrThrow2)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(query.getLong(columnIndexOrThrow2));
                        }
                        if (query.isNull(columnIndexOrThrow3)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(query.getLong(columnIndexOrThrow3));
                        }
                        if (query.isNull(columnIndexOrThrow4)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(query.getLong(columnIndexOrThrow4));
                        }
                        if (query.isNull(columnIndexOrThrow5)) {
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow5);
                        }
                        if (query.isNull(columnIndexOrThrow6)) {
                            string2 = null;
                        } else {
                            string2 = query.getString(columnIndexOrThrow6);
                        }
                        if (query.isNull(columnIndexOrThrow7)) {
                            string3 = null;
                        } else {
                            string3 = query.getString(columnIndexOrThrow7);
                        }
                        if (query.isNull(columnIndexOrThrow8)) {
                            string4 = null;
                        } else {
                            string4 = query.getString(columnIndexOrThrow8);
                        }
                        if (query.isNull(columnIndexOrThrow9)) {
                            string5 = null;
                        } else {
                            string5 = query.getString(columnIndexOrThrow9);
                        }
                        if (query.isNull(columnIndexOrThrow10)) {
                            string6 = null;
                        } else {
                            string6 = query.getString(columnIndexOrThrow10);
                        }
                        if (query.isNull(columnIndexOrThrow11)) {
                            string7 = null;
                        } else {
                            string7 = query.getString(columnIndexOrThrow11);
                        }
                        if (query.isNull(columnIndexOrThrow12)) {
                            string8 = null;
                        } else {
                            string8 = query.getString(columnIndexOrThrow12);
                        }
                        if (query.isNull(columnIndexOrThrow13)) {
                            i = i3;
                            valueOf4 = null;
                        } else {
                            valueOf4 = Long.valueOf(query.getLong(columnIndexOrThrow13));
                            i = i3;
                        }
                        if (query.isNull(i)) {
                            string9 = null;
                        } else {
                            string9 = query.getString(i);
                        }
                        int i4 = columnIndexOrThrow15;
                        int i5 = columnIndexOrThrow;
                        if (query.isNull(i4)) {
                            string10 = null;
                        } else {
                            string10 = query.getString(i4);
                        }
                        int i6 = columnIndexOrThrow16;
                        if (query.isNull(i6)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Long.valueOf(query.getLong(i6));
                        }
                        int i7 = columnIndexOrThrow17;
                        if (query.isNull(i7)) {
                            string11 = null;
                        } else {
                            string11 = query.getString(i7);
                        }
                        int i8 = columnIndexOrThrow18;
                        if (query.getInt(i8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i9 = columnIndexOrThrow19;
                        if (query.isNull(i9)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Integer.valueOf(query.getInt(i9));
                        }
                        int i10 = columnIndexOrThrow20;
                        if (query.isNull(i10)) {
                            string12 = null;
                        } else {
                            string12 = query.getString(i10);
                        }
                        int i11 = columnIndexOrThrow21;
                        if (query.isNull(i11)) {
                            string13 = null;
                        } else {
                            string13 = query.getString(i11);
                        }
                        int i12 = columnIndexOrThrow22;
                        if (query.isNull(i12)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Long.valueOf(query.getLong(i12));
                        }
                        int i13 = columnIndexOrThrow23;
                        if (query.isNull(i13)) {
                            string14 = null;
                        } else {
                            string14 = query.getString(i13);
                        }
                        int i14 = columnIndexOrThrow24;
                        if (query.isNull(i14)) {
                            string15 = null;
                        } else {
                            string15 = query.getString(i14);
                        }
                        int i15 = columnIndexOrThrow25;
                        if (query.isNull(i15)) {
                            valueOf8 = null;
                        } else {
                            valueOf8 = Long.valueOf(query.getLong(i15));
                        }
                        int i16 = columnIndexOrThrow26;
                        if (query.isNull(i16)) {
                            string16 = null;
                        } else {
                            string16 = query.getString(i16);
                        }
                        int i17 = columnIndexOrThrow27;
                        if (query.getInt(i17) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i18 = columnIndexOrThrow28;
                        if (query.isNull(i18)) {
                            blob = null;
                        } else {
                            blob = query.getBlob(i18);
                        }
                        int i19 = columnIndexOrThrow29;
                        if (query.getInt(i19) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i20 = columnIndexOrThrow30;
                        if (query.isNull(i20)) {
                            i2 = i20;
                            string17 = null;
                        } else {
                            string17 = query.getString(i20);
                            i2 = i20;
                        }
                        arrayList.add(new HttpTransaction(j, valueOf, valueOf2, valueOf3, string, string2, string3, string4, string5, string6, string7, string8, valueOf4, string9, string10, valueOf5, string11, z, valueOf6, string12, string13, valueOf7, string14, string15, valueOf8, string16, z2, blob, z3, string17));
                        columnIndexOrThrow = i5;
                        columnIndexOrThrow15 = i4;
                        columnIndexOrThrow16 = i6;
                        columnIndexOrThrow17 = i7;
                        columnIndexOrThrow18 = i8;
                        columnIndexOrThrow19 = i9;
                        columnIndexOrThrow20 = i10;
                        columnIndexOrThrow21 = i11;
                        columnIndexOrThrow22 = i12;
                        columnIndexOrThrow23 = i13;
                        columnIndexOrThrow24 = i14;
                        columnIndexOrThrow25 = i15;
                        columnIndexOrThrow26 = i16;
                        columnIndexOrThrow27 = i17;
                        columnIndexOrThrow28 = i18;
                        columnIndexOrThrow29 = i19;
                        columnIndexOrThrow30 = i2;
                        i3 = i;
                    }
                    query.close();
                    this.f42913a.release();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    callableC5962c = this;
                    query.close();
                    callableC5962c.f42913a.release();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                callableC5962c = this;
            }
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$d */
    /* loaded from: classes3.dex */
    public class C5963d extends EntityInsertionAdapter {
        public C5963d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `transactions` (`id`,`requestDate`,`responseDate`,`tookMs`,`protocol`,`method`,`url`,`host`,`path`,`scheme`,`responseTlsVersion`,`responseCipherSuite`,`requestPayloadSize`,`requestContentType`,`requestHeaders`,`requestHeadersSize`,`requestBody`,`isRequestBodyEncoded`,`responseCode`,`responseMessage`,`error`,`responsePayloadSize`,`responseContentType`,`responseHeaders`,`responseHeadersSize`,`responseBody`,`isResponseBodyEncoded`,`responseImageData`,`graphQlDetected`,`graphQlOperationName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: d */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, HttpTransaction httpTransaction) {
            supportSQLiteStatement.bindLong(1, httpTransaction.getId());
            if (httpTransaction.getRequestDate() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, httpTransaction.getRequestDate().longValue());
            }
            if (httpTransaction.getResponseDate() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, httpTransaction.getResponseDate().longValue());
            }
            if (httpTransaction.getTookMs() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, httpTransaction.getTookMs().longValue());
            }
            if (httpTransaction.getProtocol() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, httpTransaction.getProtocol());
            }
            if (httpTransaction.getMethod() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, httpTransaction.getMethod());
            }
            if (httpTransaction.getUrl() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, httpTransaction.getUrl());
            }
            if (httpTransaction.getHost() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, httpTransaction.getHost());
            }
            if (httpTransaction.getPath() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, httpTransaction.getPath());
            }
            if (httpTransaction.getScheme() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, httpTransaction.getScheme());
            }
            if (httpTransaction.getResponseTlsVersion() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, httpTransaction.getResponseTlsVersion());
            }
            if (httpTransaction.getResponseCipherSuite() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, httpTransaction.getResponseCipherSuite());
            }
            if (httpTransaction.getRequestPayloadSize() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindLong(13, httpTransaction.getRequestPayloadSize().longValue());
            }
            if (httpTransaction.getRequestContentType() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, httpTransaction.getRequestContentType());
            }
            if (httpTransaction.getRequestHeaders() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, httpTransaction.getRequestHeaders());
            }
            if (httpTransaction.getRequestHeadersSize() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindLong(16, httpTransaction.getRequestHeadersSize().longValue());
            }
            if (httpTransaction.getRequestBody() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, httpTransaction.getRequestBody());
            }
            supportSQLiteStatement.bindLong(18, httpTransaction.isRequestBodyEncoded() ? 1L : 0L);
            if (httpTransaction.getResponseCode() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindLong(19, httpTransaction.getResponseCode().intValue());
            }
            if (httpTransaction.getResponseMessage() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, httpTransaction.getResponseMessage());
            }
            if (httpTransaction.getError() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, httpTransaction.getError());
            }
            if (httpTransaction.getResponsePayloadSize() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindLong(22, httpTransaction.getResponsePayloadSize().longValue());
            }
            if (httpTransaction.getResponseContentType() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, httpTransaction.getResponseContentType());
            }
            if (httpTransaction.getResponseHeaders() == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindString(24, httpTransaction.getResponseHeaders());
            }
            if (httpTransaction.getResponseHeadersSize() == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindLong(25, httpTransaction.getResponseHeadersSize().longValue());
            }
            if (httpTransaction.getResponseBody() == null) {
                supportSQLiteStatement.bindNull(26);
            } else {
                supportSQLiteStatement.bindString(26, httpTransaction.getResponseBody());
            }
            supportSQLiteStatement.bindLong(27, httpTransaction.isResponseBodyEncoded() ? 1L : 0L);
            if (httpTransaction.getResponseImageData() == null) {
                supportSQLiteStatement.bindNull(28);
            } else {
                supportSQLiteStatement.bindBlob(28, httpTransaction.getResponseImageData());
            }
            supportSQLiteStatement.bindLong(29, httpTransaction.getGraphQlDetected() ? 1L : 0L);
            if (httpTransaction.getGraphQlOperationName() == null) {
                supportSQLiteStatement.bindNull(30);
            } else {
                supportSQLiteStatement.bindString(30, httpTransaction.getGraphQlOperationName());
            }
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$e */
    /* loaded from: classes3.dex */
    public class C5964e extends EntityDeletionOrUpdateAdapter {
        public C5964e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR REPLACE `transactions` SET `id` = ?,`requestDate` = ?,`responseDate` = ?,`tookMs` = ?,`protocol` = ?,`method` = ?,`url` = ?,`host` = ?,`path` = ?,`scheme` = ?,`responseTlsVersion` = ?,`responseCipherSuite` = ?,`requestPayloadSize` = ?,`requestContentType` = ?,`requestHeaders` = ?,`requestHeadersSize` = ?,`requestBody` = ?,`isRequestBodyEncoded` = ?,`responseCode` = ?,`responseMessage` = ?,`error` = ?,`responsePayloadSize` = ?,`responseContentType` = ?,`responseHeaders` = ?,`responseHeadersSize` = ?,`responseBody` = ?,`isResponseBodyEncoded` = ?,`responseImageData` = ?,`graphQlDetected` = ?,`graphQlOperationName` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: d */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, HttpTransaction httpTransaction) {
            supportSQLiteStatement.bindLong(1, httpTransaction.getId());
            if (httpTransaction.getRequestDate() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, httpTransaction.getRequestDate().longValue());
            }
            if (httpTransaction.getResponseDate() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, httpTransaction.getResponseDate().longValue());
            }
            if (httpTransaction.getTookMs() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, httpTransaction.getTookMs().longValue());
            }
            if (httpTransaction.getProtocol() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, httpTransaction.getProtocol());
            }
            if (httpTransaction.getMethod() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, httpTransaction.getMethod());
            }
            if (httpTransaction.getUrl() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, httpTransaction.getUrl());
            }
            if (httpTransaction.getHost() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, httpTransaction.getHost());
            }
            if (httpTransaction.getPath() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, httpTransaction.getPath());
            }
            if (httpTransaction.getScheme() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, httpTransaction.getScheme());
            }
            if (httpTransaction.getResponseTlsVersion() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, httpTransaction.getResponseTlsVersion());
            }
            if (httpTransaction.getResponseCipherSuite() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, httpTransaction.getResponseCipherSuite());
            }
            if (httpTransaction.getRequestPayloadSize() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindLong(13, httpTransaction.getRequestPayloadSize().longValue());
            }
            if (httpTransaction.getRequestContentType() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, httpTransaction.getRequestContentType());
            }
            if (httpTransaction.getRequestHeaders() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, httpTransaction.getRequestHeaders());
            }
            if (httpTransaction.getRequestHeadersSize() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindLong(16, httpTransaction.getRequestHeadersSize().longValue());
            }
            if (httpTransaction.getRequestBody() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, httpTransaction.getRequestBody());
            }
            supportSQLiteStatement.bindLong(18, httpTransaction.isRequestBodyEncoded() ? 1L : 0L);
            if (httpTransaction.getResponseCode() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindLong(19, httpTransaction.getResponseCode().intValue());
            }
            if (httpTransaction.getResponseMessage() == null) {
                supportSQLiteStatement.bindNull(20);
            } else {
                supportSQLiteStatement.bindString(20, httpTransaction.getResponseMessage());
            }
            if (httpTransaction.getError() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, httpTransaction.getError());
            }
            if (httpTransaction.getResponsePayloadSize() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindLong(22, httpTransaction.getResponsePayloadSize().longValue());
            }
            if (httpTransaction.getResponseContentType() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, httpTransaction.getResponseContentType());
            }
            if (httpTransaction.getResponseHeaders() == null) {
                supportSQLiteStatement.bindNull(24);
            } else {
                supportSQLiteStatement.bindString(24, httpTransaction.getResponseHeaders());
            }
            if (httpTransaction.getResponseHeadersSize() == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindLong(25, httpTransaction.getResponseHeadersSize().longValue());
            }
            if (httpTransaction.getResponseBody() == null) {
                supportSQLiteStatement.bindNull(26);
            } else {
                supportSQLiteStatement.bindString(26, httpTransaction.getResponseBody());
            }
            supportSQLiteStatement.bindLong(27, httpTransaction.isResponseBodyEncoded() ? 1L : 0L);
            if (httpTransaction.getResponseImageData() == null) {
                supportSQLiteStatement.bindNull(28);
            } else {
                supportSQLiteStatement.bindBlob(28, httpTransaction.getResponseImageData());
            }
            supportSQLiteStatement.bindLong(29, httpTransaction.getGraphQlDetected() ? 1L : 0L);
            if (httpTransaction.getGraphQlOperationName() == null) {
                supportSQLiteStatement.bindNull(30);
            } else {
                supportSQLiteStatement.bindString(30, httpTransaction.getGraphQlOperationName());
            }
            supportSQLiteStatement.bindLong(31, httpTransaction.getId());
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$f */
    /* loaded from: classes3.dex */
    public class C5965f extends SharedSQLiteStatement {
        public C5965f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM transactions";
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$g */
    /* loaded from: classes3.dex */
    public class C5966g extends SharedSQLiteStatement {
        public C5966g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM transactions WHERE requestDate <= ?";
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$h */
    /* loaded from: classes3.dex */
    public class CallableC5967h implements Callable {

        /* renamed from: a */
        public final /* synthetic */ HttpTransaction f42919a;

        public CallableC5967h(HttpTransaction httpTransaction) {
            this.f42919a = httpTransaction;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Long call() {
            HttpTransactionDao_Impl.this.f42904a.beginTransaction();
            try {
                long insertAndReturnId = HttpTransactionDao_Impl.this.f42905b.insertAndReturnId(this.f42919a);
                HttpTransactionDao_Impl.this.f42904a.setTransactionSuccessful();
                return Long.valueOf(insertAndReturnId);
            } finally {
                HttpTransactionDao_Impl.this.f42904a.endTransaction();
            }
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$i */
    /* loaded from: classes3.dex */
    public class CallableC5968i implements Callable {

        /* renamed from: a */
        public final /* synthetic */ HttpTransaction f42921a;

        public CallableC5968i(HttpTransaction httpTransaction) {
            this.f42921a = httpTransaction;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() {
            HttpTransactionDao_Impl.this.f42904a.beginTransaction();
            try {
                int handle = HttpTransactionDao_Impl.this.f42906c.handle(this.f42921a);
                HttpTransactionDao_Impl.this.f42904a.setTransactionSuccessful();
                return Integer.valueOf(handle);
            } finally {
                HttpTransactionDao_Impl.this.f42904a.endTransaction();
            }
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$j */
    /* loaded from: classes3.dex */
    public class CallableC5969j implements Callable {
        public CallableC5969j() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() {
            SupportSQLiteStatement acquire = HttpTransactionDao_Impl.this.f42907d.acquire();
            HttpTransactionDao_Impl.this.f42904a.beginTransaction();
            try {
                Integer valueOf = Integer.valueOf(acquire.executeUpdateDelete());
                HttpTransactionDao_Impl.this.f42904a.setTransactionSuccessful();
                return valueOf;
            } finally {
                HttpTransactionDao_Impl.this.f42904a.endTransaction();
                HttpTransactionDao_Impl.this.f42907d.release(acquire);
            }
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$k */
    /* loaded from: classes3.dex */
    public class CallableC5970k implements Callable {

        /* renamed from: a */
        public final /* synthetic */ long f42924a;

        public CallableC5970k(long j) {
            this.f42924a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() {
            SupportSQLiteStatement acquire = HttpTransactionDao_Impl.this.f42908e.acquire();
            acquire.bindLong(1, this.f42924a);
            HttpTransactionDao_Impl.this.f42904a.beginTransaction();
            try {
                Integer valueOf = Integer.valueOf(acquire.executeUpdateDelete());
                HttpTransactionDao_Impl.this.f42904a.setTransactionSuccessful();
                return valueOf;
            } finally {
                HttpTransactionDao_Impl.this.f42904a.endTransaction();
                HttpTransactionDao_Impl.this.f42908e.release(acquire);
            }
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.data.room.HttpTransactionDao_Impl$l */
    /* loaded from: classes3.dex */
    public class CallableC5971l implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f42926a;

        public CallableC5971l(RoomSQLiteQuery roomSQLiteQuery) {
            this.f42926a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            Long valueOf;
            Long valueOf2;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            Integer valueOf3;
            Long valueOf4;
            Long valueOf5;
            String string6;
            boolean z;
            String string7;
            Cursor query = DBUtil.query(HttpTransactionDao_Impl.this.f42904a, this.f42926a, false, null);
            try {
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    long j = query.getLong(0);
                    if (query.isNull(1)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(query.getLong(1));
                    }
                    if (query.isNull(2)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(query.getLong(2));
                    }
                    if (query.isNull(3)) {
                        string = null;
                    } else {
                        string = query.getString(3);
                    }
                    if (query.isNull(4)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(4);
                    }
                    if (query.isNull(5)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(5);
                    }
                    if (query.isNull(6)) {
                        string4 = null;
                    } else {
                        string4 = query.getString(6);
                    }
                    if (query.isNull(7)) {
                        string5 = null;
                    } else {
                        string5 = query.getString(7);
                    }
                    if (query.isNull(8)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(query.getInt(8));
                    }
                    if (query.isNull(9)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(query.getLong(9));
                    }
                    if (query.isNull(10)) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(query.getLong(10));
                    }
                    if (query.isNull(11)) {
                        string6 = null;
                    } else {
                        string6 = query.getString(11);
                    }
                    if (query.getInt(12) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.isNull(13)) {
                        string7 = null;
                    } else {
                        string7 = query.getString(13);
                    }
                    arrayList.add(new HttpTransactionTuple(j, valueOf, valueOf2, string, string2, string3, string4, string5, valueOf3, valueOf4, valueOf5, string6, z, string7));
                }
                return arrayList;
            } finally {
                query.close();
            }
        }

        public void finalize() {
            this.f42926a.release();
        }
    }

    public HttpTransactionDao_Impl(RoomDatabase roomDatabase) {
        this.f42904a = roomDatabase;
        this.f42905b = new C5963d(roomDatabase);
        this.f42906c = new C5964e(roomDatabase);
        this.f42907d = new C5965f(roomDatabase);
        this.f42908e = new C5966g(roomDatabase);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.chuckerteam.chucker.internal.data.room.HttpTransactionDao
    public Object deleteAll(Continuation<? super Integer> continuation) {
        return CoroutinesRoom.execute(this.f42904a, true, new CallableC5969j(), continuation);
    }

    @Override // com.chuckerteam.chucker.internal.data.room.HttpTransactionDao
    public Object deleteBefore(long j, Continuation<? super Integer> continuation) {
        return CoroutinesRoom.execute(this.f42904a, true, new CallableC5970k(j), continuation);
    }

    @Override // com.chuckerteam.chucker.internal.data.room.HttpTransactionDao
    public Object getAll(Continuation<? super List<HttpTransaction>> continuation) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM transactions", 0);
        return CoroutinesRoom.execute(this.f42904a, false, DBUtil.createCancellationSignal(), new CallableC5962c(acquire), continuation);
    }

    @Override // com.chuckerteam.chucker.internal.data.room.HttpTransactionDao
    public LiveData<HttpTransaction> getById(long j) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM transactions WHERE id = ?", 1);
        acquire.bindLong(1, j);
        return this.f42904a.getInvalidationTracker().createLiveData(new String[]{"transactions"}, false, new CallableC5961b(acquire));
    }

    @Override // com.chuckerteam.chucker.internal.data.room.HttpTransactionDao
    public LiveData<List<HttpTransactionTuple>> getFilteredTuples(String str, String str2, String str3) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions WHERE responseCode LIKE ? AND (path LIKE ? OR graphQlOperationName LIKE ?) ORDER BY requestDate DESC", 3);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        if (str2 == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str2);
        }
        if (str3 == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindString(3, str3);
        }
        return this.f42904a.getInvalidationTracker().createLiveData(new String[]{"transactions"}, false, new CallableC5960a(acquire));
    }

    @Override // com.chuckerteam.chucker.internal.data.room.HttpTransactionDao
    public LiveData<List<HttpTransactionTuple>> getSortedTuples() {
        return this.f42904a.getInvalidationTracker().createLiveData(new String[]{"transactions"}, false, new CallableC5971l(RoomSQLiteQuery.acquire("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions ORDER BY requestDate DESC", 0)));
    }

    @Override // com.chuckerteam.chucker.internal.data.room.HttpTransactionDao
    public List<HttpTransaction> getTransactionsInTimeRange(long j) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        Long valueOf4;
        int i;
        String string9;
        String string10;
        Long valueOf5;
        String string11;
        boolean z;
        Integer valueOf6;
        String string12;
        String string13;
        Long valueOf7;
        String string14;
        String string15;
        Long valueOf8;
        String string16;
        boolean z2;
        byte[] blob;
        boolean z3;
        String string17;
        int i2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM transactions WHERE requestDate >= ?", 1);
        acquire.bindLong(1, j);
        this.f42904a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f42904a, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requestDate");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "responseDate");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "tookMs");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "protocol");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, FirebaseAnalytics.Param.METHOD);
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, ImagesContract.URL);
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "host");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, ClientCookie.PATH_ATTR);
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "scheme");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "responseTlsVersion");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "responseCipherSuite");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "requestPayloadSize");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "requestContentType");
            roomSQLiteQuery = acquire;
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "requestHeaders");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "requestHeadersSize");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requestBody");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "isRequestBodyEncoded");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "responseCode");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "responseMessage");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "responsePayloadSize");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "responseContentType");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "responseHeaders");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "responseHeadersSize");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "responseBody");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "isResponseBodyEncoded");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "responseImageData");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "graphQlDetected");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "graphQlOperationName");
            int i3 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                long j2 = query.getLong(columnIndexOrThrow);
                if (query.isNull(columnIndexOrThrow2)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(query.getLong(columnIndexOrThrow2));
                }
                if (query.isNull(columnIndexOrThrow3)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(query.getLong(columnIndexOrThrow3));
                }
                if (query.isNull(columnIndexOrThrow4)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(query.getLong(columnIndexOrThrow4));
                }
                if (query.isNull(columnIndexOrThrow5)) {
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow5);
                }
                if (query.isNull(columnIndexOrThrow6)) {
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow6);
                }
                if (query.isNull(columnIndexOrThrow7)) {
                    string3 = null;
                } else {
                    string3 = query.getString(columnIndexOrThrow7);
                }
                if (query.isNull(columnIndexOrThrow8)) {
                    string4 = null;
                } else {
                    string4 = query.getString(columnIndexOrThrow8);
                }
                if (query.isNull(columnIndexOrThrow9)) {
                    string5 = null;
                } else {
                    string5 = query.getString(columnIndexOrThrow9);
                }
                if (query.isNull(columnIndexOrThrow10)) {
                    string6 = null;
                } else {
                    string6 = query.getString(columnIndexOrThrow10);
                }
                if (query.isNull(columnIndexOrThrow11)) {
                    string7 = null;
                } else {
                    string7 = query.getString(columnIndexOrThrow11);
                }
                if (query.isNull(columnIndexOrThrow12)) {
                    string8 = null;
                } else {
                    string8 = query.getString(columnIndexOrThrow12);
                }
                if (query.isNull(columnIndexOrThrow13)) {
                    i = i3;
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(query.getLong(columnIndexOrThrow13));
                    i = i3;
                }
                if (query.isNull(i)) {
                    string9 = null;
                } else {
                    string9 = query.getString(i);
                }
                int i4 = columnIndexOrThrow15;
                int i5 = columnIndexOrThrow;
                if (query.isNull(i4)) {
                    string10 = null;
                } else {
                    string10 = query.getString(i4);
                }
                int i6 = columnIndexOrThrow16;
                if (query.isNull(i6)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Long.valueOf(query.getLong(i6));
                }
                int i7 = columnIndexOrThrow17;
                if (query.isNull(i7)) {
                    string11 = null;
                } else {
                    string11 = query.getString(i7);
                }
                int i8 = columnIndexOrThrow18;
                if (query.getInt(i8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i9 = columnIndexOrThrow19;
                if (query.isNull(i9)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Integer.valueOf(query.getInt(i9));
                }
                int i10 = columnIndexOrThrow20;
                if (query.isNull(i10)) {
                    string12 = null;
                } else {
                    string12 = query.getString(i10);
                }
                int i11 = columnIndexOrThrow21;
                if (query.isNull(i11)) {
                    string13 = null;
                } else {
                    string13 = query.getString(i11);
                }
                int i12 = columnIndexOrThrow22;
                if (query.isNull(i12)) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Long.valueOf(query.getLong(i12));
                }
                int i13 = columnIndexOrThrow23;
                if (query.isNull(i13)) {
                    string14 = null;
                } else {
                    string14 = query.getString(i13);
                }
                int i14 = columnIndexOrThrow24;
                if (query.isNull(i14)) {
                    string15 = null;
                } else {
                    string15 = query.getString(i14);
                }
                int i15 = columnIndexOrThrow25;
                if (query.isNull(i15)) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Long.valueOf(query.getLong(i15));
                }
                int i16 = columnIndexOrThrow26;
                if (query.isNull(i16)) {
                    string16 = null;
                } else {
                    string16 = query.getString(i16);
                }
                int i17 = columnIndexOrThrow27;
                if (query.getInt(i17) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i18 = columnIndexOrThrow28;
                if (query.isNull(i18)) {
                    blob = null;
                } else {
                    blob = query.getBlob(i18);
                }
                int i19 = columnIndexOrThrow29;
                if (query.getInt(i19) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i20 = columnIndexOrThrow30;
                if (query.isNull(i20)) {
                    i2 = i20;
                    string17 = null;
                } else {
                    string17 = query.getString(i20);
                    i2 = i20;
                }
                arrayList.add(new HttpTransaction(j2, valueOf, valueOf2, valueOf3, string, string2, string3, string4, string5, string6, string7, string8, valueOf4, string9, string10, valueOf5, string11, z, valueOf6, string12, string13, valueOf7, string14, string15, valueOf8, string16, z2, blob, z3, string17));
                columnIndexOrThrow = i5;
                columnIndexOrThrow15 = i4;
                columnIndexOrThrow16 = i6;
                columnIndexOrThrow17 = i7;
                columnIndexOrThrow18 = i8;
                columnIndexOrThrow19 = i9;
                columnIndexOrThrow20 = i10;
                columnIndexOrThrow21 = i11;
                columnIndexOrThrow22 = i12;
                columnIndexOrThrow23 = i13;
                columnIndexOrThrow24 = i14;
                columnIndexOrThrow25 = i15;
                columnIndexOrThrow26 = i16;
                columnIndexOrThrow27 = i17;
                columnIndexOrThrow28 = i18;
                columnIndexOrThrow29 = i19;
                columnIndexOrThrow30 = i2;
                i3 = i;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // com.chuckerteam.chucker.internal.data.room.HttpTransactionDao
    public Object insert(HttpTransaction httpTransaction, Continuation<? super Long> continuation) {
        return CoroutinesRoom.execute(this.f42904a, true, new CallableC5967h(httpTransaction), continuation);
    }

    @Override // com.chuckerteam.chucker.internal.data.room.HttpTransactionDao
    public Object update(HttpTransaction httpTransaction, Continuation<? super Integer> continuation) {
        return CoroutinesRoom.execute(this.f42904a, true, new CallableC5968i(httpTransaction), continuation);
    }
}
