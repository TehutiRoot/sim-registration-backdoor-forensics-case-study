package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDActionRemoteGoTo extends PDAction {
    public static final String SUB_TYPE = "GoToR";

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9941a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60582a;

        static {
            int[] iArr = new int[OpenMode.values().length];
            f60582a = iArr;
            try {
                iArr[OpenMode.USER_PREFERENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60582a[OpenMode.SAME_WINDOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60582a[OpenMode.NEW_WINDOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PDActionRemoteGoTo() {
        setSubType(SUB_TYPE);
    }

    public COSBase getD() {
        return this.action.getDictionaryObject(COSName.f59782D);
    }

    public PDFileSpecification getFile() throws IOException {
        return PDFileSpecification.createFS(this.action.getDictionaryObject(COSName.f59794F));
    }

    public OpenMode getOpenInNewWindow() {
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.NEW_WINDOW;
        if (cOSObject.getDictionaryObject(cOSName) instanceof COSBoolean) {
            if (((COSBoolean) getCOSObject().getDictionaryObject(cOSName)).getValue()) {
                return OpenMode.NEW_WINDOW;
            }
            return OpenMode.SAME_WINDOW;
        }
        return OpenMode.USER_PREFERENCE;
    }

    @Deprecated
    public String getS() {
        return this.action.getNameAsString(COSName.f59836S);
    }

    public void setD(COSBase cOSBase) {
        this.action.setItem(COSName.f59782D, cOSBase);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        this.action.setItem(COSName.f59794F, pDFileSpecification);
    }

    @Deprecated
    public void setOpenInNewWindow(boolean z) {
        this.action.setBoolean(COSName.NEW_WINDOW, z);
    }

    @Deprecated
    public void setS(String str) {
        this.action.setName(COSName.f59836S, str);
    }

    @Deprecated
    public boolean shouldOpenInNewWindow() {
        return this.action.getBoolean(COSName.NEW_WINDOW, true);
    }

    public void setOpenInNewWindow(OpenMode openMode) {
        if (openMode == null) {
            getCOSObject().removeItem(COSName.NEW_WINDOW);
            return;
        }
        int i = C9941a.f60582a[openMode.ordinal()];
        if (i == 1) {
            getCOSObject().removeItem(COSName.NEW_WINDOW);
        } else if (i == 2) {
            getCOSObject().setBoolean(COSName.NEW_WINDOW, false);
        } else if (i != 3) {
        } else {
            getCOSObject().setBoolean(COSName.NEW_WINDOW, true);
        }
    }

    public PDActionRemoteGoTo(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}