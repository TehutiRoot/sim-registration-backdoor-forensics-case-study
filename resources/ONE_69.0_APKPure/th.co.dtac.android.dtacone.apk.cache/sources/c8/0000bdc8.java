package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setAddStatesFromChildren extends setLayoutAnimationListener {
    private static int get = 1;
    private static int values;

    public setAddStatesFromChildren(setOnHierarchyChangeListener setonhierarchychangelistener) {
        super(setonhierarchychangelistener);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutAnimationListener
    public setAnimationCacheEnabled ThreeDS2Service() {
        setAddStatesFromChildren setaddstatesfromchildren = new setAddStatesFromChildren(ThreeDS2ServiceInstance());
        int i = get;
        int i2 = (i & (-22)) | ((~i) & 21);
        int i3 = (i & 21) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return setaddstatesfromchildren;
        }
        throw null;
    }
}