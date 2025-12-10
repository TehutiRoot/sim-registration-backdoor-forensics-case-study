package com.github.barteksc.pdfviewer.listener;

import android.view.MotionEvent;
import com.github.barteksc.pdfviewer.link.LinkHandler;
import com.github.barteksc.pdfviewer.model.LinkTapEvent;

/* loaded from: classes3.dex */
public class Callbacks {

    /* renamed from: a */
    public OnLoadCompleteListener f43664a;

    /* renamed from: b */
    public OnErrorListener f43665b;

    /* renamed from: c */
    public OnPageErrorListener f43666c;

    /* renamed from: d */
    public OnRenderListener f43667d;

    /* renamed from: e */
    public OnPageChangeListener f43668e;

    /* renamed from: f */
    public OnPageScrollListener f43669f;

    /* renamed from: g */
    public OnDrawListener f43670g;

    /* renamed from: h */
    public OnDrawListener f43671h;

    /* renamed from: i */
    public OnTapListener f43672i;

    /* renamed from: j */
    public OnLongPressListener f43673j;

    /* renamed from: k */
    public LinkHandler f43674k;

    public void callLinkHandler(LinkTapEvent linkTapEvent) {
        LinkHandler linkHandler = this.f43674k;
        if (linkHandler != null) {
            linkHandler.handleLinkEvent(linkTapEvent);
        }
    }

    public void callOnLoadComplete(int i) {
        OnLoadCompleteListener onLoadCompleteListener = this.f43664a;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.loadComplete(i);
        }
    }

    public void callOnLongPress(MotionEvent motionEvent) {
        OnLongPressListener onLongPressListener = this.f43673j;
        if (onLongPressListener != null) {
            onLongPressListener.onLongPress(motionEvent);
        }
    }

    public void callOnPageChange(int i, int i2) {
        OnPageChangeListener onPageChangeListener = this.f43668e;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageChanged(i, i2);
        }
    }

    public boolean callOnPageError(int i, Throwable th2) {
        OnPageErrorListener onPageErrorListener = this.f43666c;
        if (onPageErrorListener != null) {
            onPageErrorListener.onPageError(i, th2);
            return true;
        }
        return false;
    }

    public void callOnPageScroll(int i, float f) {
        OnPageScrollListener onPageScrollListener = this.f43669f;
        if (onPageScrollListener != null) {
            onPageScrollListener.onPageScrolled(i, f);
        }
    }

    public void callOnRender(int i) {
        OnRenderListener onRenderListener = this.f43667d;
        if (onRenderListener != null) {
            onRenderListener.onInitiallyRendered(i);
        }
    }

    public boolean callOnTap(MotionEvent motionEvent) {
        OnTapListener onTapListener = this.f43672i;
        if (onTapListener != null && onTapListener.onTap(motionEvent)) {
            return true;
        }
        return false;
    }

    public OnDrawListener getOnDraw() {
        return this.f43670g;
    }

    public OnDrawListener getOnDrawAll() {
        return this.f43671h;
    }

    public OnErrorListener getOnError() {
        return this.f43665b;
    }

    public void setLinkHandler(LinkHandler linkHandler) {
        this.f43674k = linkHandler;
    }

    public void setOnDraw(OnDrawListener onDrawListener) {
        this.f43670g = onDrawListener;
    }

    public void setOnDrawAll(OnDrawListener onDrawListener) {
        this.f43671h = onDrawListener;
    }

    public void setOnError(OnErrorListener onErrorListener) {
        this.f43665b = onErrorListener;
    }

    public void setOnLoadComplete(OnLoadCompleteListener onLoadCompleteListener) {
        this.f43664a = onLoadCompleteListener;
    }

    public void setOnLongPress(OnLongPressListener onLongPressListener) {
        this.f43673j = onLongPressListener;
    }

    public void setOnPageChange(OnPageChangeListener onPageChangeListener) {
        this.f43668e = onPageChangeListener;
    }

    public void setOnPageError(OnPageErrorListener onPageErrorListener) {
        this.f43666c = onPageErrorListener;
    }

    public void setOnPageScroll(OnPageScrollListener onPageScrollListener) {
        this.f43669f = onPageScrollListener;
    }

    public void setOnRender(OnRenderListener onRenderListener) {
        this.f43667d = onRenderListener;
    }

    public void setOnTap(OnTapListener onTapListener) {
        this.f43672i = onTapListener;
    }
}