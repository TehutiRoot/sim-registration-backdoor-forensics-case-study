package org.apache.commons.p028io;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.File;
import java.io.IOException;

/* renamed from: org.apache.commons.io.FileDeleteStrategy */
/* loaded from: classes6.dex */
public class FileDeleteStrategy {

    /* renamed from: a */
    public final String f73324a;
    public static final FileDeleteStrategy NORMAL = new FileDeleteStrategy(PDLayoutAttributeObject.LINE_HEIGHT_NORMAL);
    public static final FileDeleteStrategy FORCE = new C12507a();

    /* renamed from: org.apache.commons.io.FileDeleteStrategy$a */
    /* loaded from: classes6.dex */
    public static class C12507a extends FileDeleteStrategy {
        public C12507a() {
            super("Force");
        }

        @Override // org.apache.commons.p028io.FileDeleteStrategy
        public boolean doDelete(File file) {
            FileUtils.forceDelete(file);
            return true;
        }
    }

    public FileDeleteStrategy(String str) {
        this.f73324a = str;
    }

    public void delete(File file) throws IOException {
        if (file.exists() && !doDelete(file)) {
            throw new IOException("Deletion failed: " + file);
        }
    }

    public boolean deleteQuietly(File file) {
        if (file != null && file.exists()) {
            try {
                return doDelete(file);
            } catch (IOException unused) {
                return false;
            }
        }
        return true;
    }

    public boolean doDelete(File file) throws IOException {
        FileUtils.delete(file);
        return true;
    }

    public String toString() {
        return "FileDeleteStrategy[" + this.f73324a + "]";
    }
}