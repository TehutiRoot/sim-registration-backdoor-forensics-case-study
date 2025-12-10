package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;

/* loaded from: classes5.dex */
public class PDHighlightAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDHighlightAppearanceHandler(PDAnnotation pDAnnotation) {
        super(pDAnnotation);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateAppearanceStreams() {
        generateNormalAppearance();
        generateRolloverAppearance();
        generateDownAppearance();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01d8 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:25:0x0146, B:26:0x0149, B:28:0x014e, B:30:0x015a, B:32:0x0168, B:34:0x0176, B:36:0x0182, B:37:0x0186, B:50:0x01c5, B:52:0x01d8, B:57:0x0217, B:59:0x022e, B:64:0x0269, B:60:0x0243, B:62:0x024d, B:63:0x0262, B:53:0x01ef, B:55:0x01fb, B:56:0x0210, B:40:0x018d, B:42:0x019b, B:44:0x01a7, B:46:0x01b3, B:48:0x01bf), top: B:93:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ef A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:25:0x0146, B:26:0x0149, B:28:0x014e, B:30:0x015a, B:32:0x0168, B:34:0x0176, B:36:0x0182, B:37:0x0186, B:50:0x01c5, B:52:0x01d8, B:57:0x0217, B:59:0x022e, B:64:0x0269, B:60:0x0243, B:62:0x024d, B:63:0x0262, B:53:0x01ef, B:55:0x01fb, B:56:0x0210, B:40:0x018d, B:42:0x019b, B:44:0x01a7, B:46:0x01b3, B:48:0x01bf), top: B:93:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022e A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:25:0x0146, B:26:0x0149, B:28:0x014e, B:30:0x015a, B:32:0x0168, B:34:0x0176, B:36:0x0182, B:37:0x0186, B:50:0x01c5, B:52:0x01d8, B:57:0x0217, B:59:0x022e, B:64:0x0269, B:60:0x0243, B:62:0x024d, B:63:0x0262, B:53:0x01ef, B:55:0x01fb, B:56:0x0210, B:40:0x018d, B:42:0x019b, B:44:0x01a7, B:46:0x01b3, B:48:0x01bf), top: B:93:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0243 A[Catch: all -> 0x0189, TryCatch #4 {all -> 0x0189, blocks: (B:25:0x0146, B:26:0x0149, B:28:0x014e, B:30:0x015a, B:32:0x0168, B:34:0x0176, B:36:0x0182, B:37:0x0186, B:50:0x01c5, B:52:0x01d8, B:57:0x0217, B:59:0x022e, B:64:0x0269, B:60:0x0243, B:62:0x024d, B:63:0x0262, B:53:0x01ef, B:55:0x01fb, B:56:0x0210, B:40:0x018d, B:42:0x019b, B:44:0x01a7, B:46:0x01b3, B:48:0x01bf), top: B:93:0x0146 }] */
    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void generateNormalAppearance() {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDHighlightAppearanceHandler.generateNormalAppearance():void");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }

    public PDHighlightAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }
}
