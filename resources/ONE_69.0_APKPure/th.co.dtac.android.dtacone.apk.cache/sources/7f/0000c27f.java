package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDActionLaunch extends PDAction {
    public static final String SUB_TYPE = "Launch";

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionLaunch$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9940a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60581a;

        static {
            int[] iArr = new int[OpenMode.values().length];
            f60581a = iArr;
            try {
                iArr[OpenMode.USER_PREFERENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60581a[OpenMode.SAME_WINDOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60581a[OpenMode.NEW_WINDOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PDActionLaunch() {
        setSubType(SUB_TYPE);
    }

    public String getD() {
        return this.action.getString(COSName.f59782D);
    }

    public String getF() {
        return this.action.getString(COSName.f59794F);
    }

    public PDFileSpecification getFile() throws IOException {
        return PDFileSpecification.createFS(getCOSObject().getDictionaryObject(COSName.f59794F));
    }

    public String getO() {
        return this.action.getString(COSName.f59821O);
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

    public String getP() {
        return this.action.getString(COSName.f59827P);
    }

    public PDWindowsLaunchParams getWinLaunchParams() {
        COSDictionary cOSDictionary = (COSDictionary) this.action.getDictionaryObject("Win");
        if (cOSDictionary != null) {
            return new PDWindowsLaunchParams(cOSDictionary);
        }
        return null;
    }

    public void setD(String str) {
        this.action.setString(COSName.f59782D, str);
    }

    public void setF(String str) {
        this.action.setString(COSName.f59794F, str);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        getCOSObject().setItem(COSName.f59794F, pDFileSpecification);
    }

    public void setO(String str) {
        this.action.setString(COSName.f59821O, str);
    }

    @Deprecated
    public void setOpenInNewWindow(boolean z) {
        this.action.setBoolean(COSName.NEW_WINDOW, z);
    }

    public void setP(String str) {
        this.action.setString(COSName.f59827P, str);
    }

    public void setWinLaunchParams(PDWindowsLaunchParams pDWindowsLaunchParams) {
        this.action.setItem("Win", pDWindowsLaunchParams);
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
        int i = C9940a.f60581a[openMode.ordinal()];
        if (i == 1) {
            getCOSObject().removeItem(COSName.NEW_WINDOW);
        } else if (i == 2) {
            getCOSObject().setBoolean(COSName.NEW_WINDOW, false);
        } else if (i != 3) {
        } else {
            getCOSObject().setBoolean(COSName.NEW_WINDOW, true);
        }
    }

    public PDActionLaunch(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}