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
    public long f59057a;

    /* renamed from: b */
    public ParcelFileDescriptor f59058b;

    /* renamed from: c */
    public final Map f59059c = new ArrayMap();

    /* loaded from: classes5.dex */
    public static class Bookmark {

        /* renamed from: a */
        public List f59060a = new ArrayList();

        /* renamed from: b */
        public String f59061b;

        /* renamed from: c */
        public long f59062c;

        /* renamed from: d */
        public long f59063d;

        public List<Bookmark> getChildren() {
            return this.f59060a;
        }

        public long getPageIdx() {
            return this.f59062c;
        }

        public String getTitle() {
            return this.f59061b;
        }

        public boolean hasChildren() {
            return !this.f59060a.isEmpty();
        }
    }

    /* loaded from: classes5.dex */
    public static class Link {

        /* renamed from: a */
        public RectF f59064a;

        /* renamed from: b */
        public Integer f59065b;

        /* renamed from: c */
        public String f59066c;

        public Link(RectF rectF, Integer num, String str) {
            this.f59064a = rectF;
            this.f59065b = num;
            this.f59066c = str;
        }

        public RectF getBounds() {
            return this.f59064a;
        }

        public Integer getDestPageIdx() {
            return this.f59065b;
        }

        public String getUri() {
            return this.f59066c;
        }
    }

    /* loaded from: classes5.dex */
    public static class Meta {

        /* renamed from: a */
        public String f59067a;

        /* renamed from: b */
        public String f59068b;

        /* renamed from: c */
        public String f59069c;

        /* renamed from: d */
        public String f59070d;

        /* renamed from: e */
        public String f59071e;

        /* renamed from: f */
        public String f59072f;

        /* renamed from: g */
        public String f59073g;

        /* renamed from: h */
        public String f59074h;

        public String getAuthor() {
            return this.f59068b;
        }

        public String getCreationDate() {
            return this.f59073g;
        }

        public String getCreator() {
            return this.f59071e;
        }

        public String getKeywords() {
            return this.f59070d;
        }

        public String getModDate() {
            return this.f59074h;
        }

        public String getProducer() {
            return this.f59072f;
        }

        public String getSubject() {
            return this.f59069c;
        }

        public String getTitle() {
            return this.f59067a;
        }
    }

    public boolean hasPage(int i) {
        return this.f59059c.containsKey(Integer.valueOf(i));
    }
}