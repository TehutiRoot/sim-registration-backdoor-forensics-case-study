package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDActionEmbeddedGoTo extends PDAction {
    public static final String SUB_TYPE = "GoToE";

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionEmbeddedGoTo$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9939a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60580a;

        static {
            int[] iArr = new int[OpenMode.values().length];
            f60580a = iArr;
            try {
                iArr[OpenMode.USER_PREFERENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60580a[OpenMode.SAME_WINDOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60580a[OpenMode.NEW_WINDOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PDActionEmbeddedGoTo() {
        setSubType(SUB_TYPE);
    }

    public PDDestination getDestination() throws IOException {
        return PDDestination.create(getCOSObject().getDictionaryObject(COSName.f59782D));
    }

    public PDFileSpecification getFile() throws IOException {
        return PDFileSpecification.createFS(getCOSObject().getDictionaryObject(COSName.f59794F));
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

    public PDTargetDirectory getTargetDirectory() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59845T);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDTargetDirectory((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public void setDestination(PDDestination pDDestination) {
        if (pDDestination instanceof PDPageDestination) {
            COSArray cOSObject = ((PDPageDestination) pDDestination).getCOSObject();
            if (cOSObject.size() >= 1 && !(cOSObject.getObject(0) instanceof COSDictionary)) {
                throw new IllegalArgumentException("Destination of a GoToE action must be a page dictionary object");
            }
        }
        getCOSObject().setItem(COSName.f59782D, pDDestination);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        getCOSObject().setItem(COSName.f59794F, pDFileSpecification);
    }

    public void setOpenInNewWindow(OpenMode openMode) {
        if (openMode == null) {
            getCOSObject().removeItem(COSName.NEW_WINDOW);
            return;
        }
        int i = C9939a.f60580a[openMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    getCOSObject().setBoolean(COSName.NEW_WINDOW, true);
                    return;
                }
                return;
            }
            getCOSObject().setBoolean(COSName.NEW_WINDOW, false);
            return;
        }
        getCOSObject().removeItem(COSName.NEW_WINDOW);
    }

    public void setTargetDirectory(PDTargetDirectory pDTargetDirectory) {
        getCOSObject().setItem(COSName.f59845T, pDTargetDirectory);
    }

    public PDActionEmbeddedGoTo(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}