package com.tom_roush.pdfbox.pdmodel.graphics.state;

import androidx.exifinterface.media.ExifInterface;

/* loaded from: classes5.dex */
public enum RenderingIntent {
    ABSOLUTE_COLORIMETRIC("AbsoluteColorimetric"),
    RELATIVE_COLORIMETRIC("RelativeColorimetric"),
    SATURATION(ExifInterface.TAG_SATURATION),
    PERCEPTUAL("Perceptual");
    
    private final String value;

    RenderingIntent(String str) {
        this.value = str;
    }

    public static RenderingIntent fromString(String str) {
        RenderingIntent[] values;
        for (RenderingIntent renderingIntent : values()) {
            if (renderingIntent.value.equals(str)) {
                return renderingIntent;
            }
        }
        return RELATIVE_COLORIMETRIC;
    }

    public String stringValue() {
        return this.value;
    }
}
