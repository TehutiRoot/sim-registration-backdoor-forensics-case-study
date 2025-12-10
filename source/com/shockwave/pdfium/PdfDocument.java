package com.shockwave.pdfium;

import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class PdfDocument {

    /* renamed from: a */
    public long f59045a;

    /* renamed from: b */
    public ParcelFileDescriptor f59046b;

    /* renamed from: c */
    public final Map f59047c = new ArrayMap();

    /* loaded from: classes5.dex */
    public static class Bookmark {

        /* renamed from: a */
        public List f59048a = new ArrayList();

        /* renamed from: b */
        public String f59049b;

        /* renamed from: c */
        public long f59050c;

        /* renamed from: d */
        public long f59051d;

        public List<Bookmark> getChildren() {
            return this.f59048a;
        }

        public long getPageIdx() {
            return this.f59050c;
        }

        public String getTitle() {
            return this.f59049b;
        }

        public boolean hasChildren() {
            return !this.f59048a.isEmpty();
        }
    }

    /* loaded from: classes5.dex */
    public static class Link {

        /* renamed from: a */
        public RectF f59052a;

        /* renamed from: b */
        public Integer f59053b;

        /* renamed from: c */
        public String f59054c;

        public Link(RectF rectF, Integer num, String str) {
            this.f59052a = rectF;
            this.f59053b = num;
            this.f59054c = str;
        }

        public RectF getBounds() {
            return this.f59052a;
        }

        public Integer getDestPageIdx() {
            return this.f59053b;
        }

        public String getUri() {
            return this.f59054c;
        }
    }

    /* loaded from: classes5.dex */
    public static class Meta {

        /* renamed from: a */
        public String f59055a;

        /* renamed from: b */
        public String f59056b;

        /* renamed from: c */
        public String f59057c;

        /* renamed from: d */
        public String f59058d;

        /* renamed from: e */
        public String f59059e;

        /* renamed from: f */
        public String f59060f;

        /* renamed from: g */
        public String f59061g;

        /* renamed from: h */
        public String f59062h;

        public String getAuthor() {
            return this.f59056b;
        }

        public String getCreationDate() {
            return this.f59061g;
        }

        public String getCreator() {
            return this.f59059e;
        }

        public String getKeywords() {
            return this.f59058d;
        }

        public String getModDate() {
            return this.f59062h;
        }

        public String getProducer() {
            return this.f59060f;
        }

        public String getSubject() {
            return this.f59057c;
        }

        public String getTitle() {
            return this.f59055a;
        }
    }

    public boolean hasPage(int i) {
        return this.f59047c.containsKey(Integer.valueOf(i));
    }
}
