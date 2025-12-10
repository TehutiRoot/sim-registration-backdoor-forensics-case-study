package p000;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.documentfile.provider.DocumentFile;

/* renamed from: FJ1 */
/* loaded from: classes2.dex */
public class FJ1 extends DocumentFile {

    /* renamed from: b */
    public Context f1581b;

    /* renamed from: c */
    public Uri f1582c;

    public FJ1(DocumentFile documentFile, Context context, Uri uri) {
        super(documentFile);
        this.f1581b = context;
        this.f1582c = uri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        return AbstractC17039xJ.m556a(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        return AbstractC17039xJ.m555b(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createDirectory(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createFile(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
        try {
            return DocumentsContract.deleteDocument(this.f1581b.getContentResolver(), this.f1582c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        return AbstractC17039xJ.m553d(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getName() {
        return AbstractC17039xJ.m551f(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getType() {
        return AbstractC17039xJ.m549h(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public Uri getUri() {
        return this.f1582c;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        return AbstractC17039xJ.m548i(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        return AbstractC17039xJ.m547j(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        return AbstractC17039xJ.m546k(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        return AbstractC17039xJ.m545l(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        return AbstractC17039xJ.m544m(this.f1581b, this.f1582c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile[] listFiles() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(String str) {
        throw new UnsupportedOperationException();
    }
}
