package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.documentfile.provider.DocumentFile;
import java.util.ArrayList;

/* renamed from: FV1 */
/* loaded from: classes2.dex */
public class FV1 extends DocumentFile {

    /* renamed from: b */
    public Context f1629b;

    /* renamed from: c */
    public Uri f1630c;

    public FV1(DocumentFile documentFile, Context context, Uri uri) {
        super(documentFile);
        this.f1629b = context;
        this.f1630c = uri;
    }

    /* renamed from: a */
    public static void m68398a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static Uri m68397b(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        return AbstractC17039xJ.m556a(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        return AbstractC17039xJ.m555b(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createDirectory(String str) {
        Uri m68397b = m68397b(this.f1629b, this.f1630c, "vnd.android.document/directory", str);
        if (m68397b != null) {
            return new FV1(this, this.f1629b, m68397b);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile createFile(String str, String str2) {
        Uri m68397b = m68397b(this.f1629b, this.f1630c, str, str2);
        if (m68397b != null) {
            return new FV1(this, this.f1629b, m68397b);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
        try {
            return DocumentsContract.deleteDocument(this.f1629b.getContentResolver(), this.f1630c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        return AbstractC17039xJ.m553d(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getName() {
        return AbstractC17039xJ.m551f(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public String getType() {
        return AbstractC17039xJ.m549h(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public Uri getUri() {
        return this.f1630c;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        return AbstractC17039xJ.m548i(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        return AbstractC17039xJ.m547j(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        return AbstractC17039xJ.m546k(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        return AbstractC17039xJ.m545l(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        return AbstractC17039xJ.m544m(this.f1629b, this.f1630c);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile[] listFiles() {
        ContentResolver contentResolver = this.f1629b.getContentResolver();
        Uri uri = this.f1630c;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f1630c, cursor.getString(0)));
                }
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            DocumentFile[] documentFileArr = new DocumentFile[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                documentFileArr[i] = new FV1(this, this.f1629b, uriArr[i]);
            }
            return documentFileArr;
        } finally {
            m68398a(cursor);
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f1629b.getContentResolver(), this.f1630c, str);
            if (renameDocument != null) {
                this.f1630c = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
