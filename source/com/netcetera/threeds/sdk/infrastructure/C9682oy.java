package com.netcetera.threeds.sdk.infrastructure;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.oy */
/* loaded from: classes5.dex */
public class C9682oy {
    private LinkedList values;
    private C9686pb valueOf = new C9686pb(null);
    private C9685pa get = null;
    private int ThreeDS2ServiceInstance = 0;

    private int ThreeDS2Service(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        return ((Integer) linkedList.getFirst()).intValue();
    }

    private Map ThreeDS2ServiceInstance(InterfaceC9687pc interfaceC9687pc) {
        if (interfaceC9687pc == null) {
            return new C9677ot();
        }
        Map valueOf = interfaceC9687pc.valueOf();
        if (valueOf == null) {
            return new C9677ot();
        }
        return valueOf;
    }

    private void valueOf() throws C9683oz, IOException {
        C9685pa values = this.valueOf.values();
        this.get = values;
        if (values == null) {
            this.get = new C9685pa(-1, null);
        }
    }

    public Object get(Reader reader, InterfaceC9687pc interfaceC9687pc) throws IOException, C9683oz {
        ThreeDS2Service(reader);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        do {
            valueOf();
            int i = this.ThreeDS2ServiceInstance;
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    int i2 = this.get.values;
                                    if (i2 != 0) {
                                        if (i2 != 1) {
                                            if (i2 != 3) {
                                                if (i2 != 6) {
                                                    this.ThreeDS2ServiceInstance = -1;
                                                }
                                            } else {
                                                linkedList.removeFirst();
                                                Map map = (Map) linkedList2.getFirst();
                                                List valueOf = valueOf(interfaceC9687pc);
                                                map.put((String) linkedList2.removeFirst(), valueOf);
                                                this.ThreeDS2ServiceInstance = 3;
                                                linkedList.addFirst(new Integer(3));
                                                linkedList2.addFirst(valueOf);
                                            }
                                        } else {
                                            linkedList.removeFirst();
                                            Map map2 = (Map) linkedList2.getFirst();
                                            Map ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(interfaceC9687pc);
                                            map2.put((String) linkedList2.removeFirst(), ThreeDS2ServiceInstance);
                                            this.ThreeDS2ServiceInstance = 2;
                                            linkedList.addFirst(new Integer(2));
                                            linkedList2.addFirst(ThreeDS2ServiceInstance);
                                        }
                                    } else {
                                        linkedList.removeFirst();
                                        ((Map) linkedList2.getFirst()).put((String) linkedList2.removeFirst(), this.get.get);
                                        this.ThreeDS2ServiceInstance = ThreeDS2Service(linkedList);
                                    }
                                }
                            } else {
                                int i3 = this.get.values;
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 != 3) {
                                            if (i3 != 4) {
                                                if (i3 != 5) {
                                                    this.ThreeDS2ServiceInstance = -1;
                                                }
                                            } else if (linkedList2.size() > 1) {
                                                linkedList.removeFirst();
                                                linkedList2.removeFirst();
                                                this.ThreeDS2ServiceInstance = ThreeDS2Service(linkedList);
                                            } else {
                                                this.ThreeDS2ServiceInstance = 1;
                                            }
                                        } else {
                                            List valueOf2 = valueOf(interfaceC9687pc);
                                            ((List) linkedList2.getFirst()).add(valueOf2);
                                            this.ThreeDS2ServiceInstance = 3;
                                            linkedList.addFirst(new Integer(3));
                                            linkedList2.addFirst(valueOf2);
                                        }
                                    } else {
                                        Map ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(interfaceC9687pc);
                                        ((List) linkedList2.getFirst()).add(ThreeDS2ServiceInstance2);
                                        this.ThreeDS2ServiceInstance = 2;
                                        linkedList.addFirst(new Integer(2));
                                        linkedList2.addFirst(ThreeDS2ServiceInstance2);
                                    }
                                } else {
                                    ((List) linkedList2.getFirst()).add(this.get.get);
                                }
                            }
                        } else {
                            C9685pa c9685pa = this.get;
                            int i4 = c9685pa.values;
                            if (i4 != 0) {
                                if (i4 != 2) {
                                    if (i4 != 5) {
                                        this.ThreeDS2ServiceInstance = -1;
                                    }
                                } else if (linkedList2.size() > 1) {
                                    linkedList.removeFirst();
                                    linkedList2.removeFirst();
                                    this.ThreeDS2ServiceInstance = ThreeDS2Service(linkedList);
                                } else {
                                    this.ThreeDS2ServiceInstance = 1;
                                }
                            } else {
                                Object obj = c9685pa.get;
                                if (obj instanceof String) {
                                    linkedList2.addFirst((String) obj);
                                    this.ThreeDS2ServiceInstance = 4;
                                    linkedList.addFirst(new Integer(4));
                                } else {
                                    this.ThreeDS2ServiceInstance = -1;
                                }
                            }
                        }
                    } else if (this.get.values == -1) {
                        return linkedList2.removeFirst();
                    } else {
                        throw new C9683oz(ThreeDS2Service(), 1, this.get);
                    }
                } else {
                    int i5 = this.get.values;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 3) {
                                this.ThreeDS2ServiceInstance = -1;
                            } else {
                                this.ThreeDS2ServiceInstance = 3;
                                linkedList.addFirst(new Integer(3));
                                linkedList2.addFirst(valueOf(interfaceC9687pc));
                            }
                        } else {
                            this.ThreeDS2ServiceInstance = 2;
                            linkedList.addFirst(new Integer(2));
                            linkedList2.addFirst(ThreeDS2ServiceInstance(interfaceC9687pc));
                        }
                    } else {
                        this.ThreeDS2ServiceInstance = 1;
                        linkedList.addFirst(new Integer(1));
                        linkedList2.addFirst(this.get.get);
                    }
                }
                if (this.ThreeDS2ServiceInstance == -1) {
                    throw new C9683oz(ThreeDS2Service(), 1, this.get);
                }
            } else {
                throw new C9683oz(ThreeDS2Service(), 1, this.get);
            }
        } while (this.get.values != -1);
        throw new C9683oz(ThreeDS2Service(), 1, this.get);
    }

    public void values() {
        this.get = null;
        this.ThreeDS2ServiceInstance = 0;
        this.values = null;
    }

    private List valueOf(InterfaceC9687pc interfaceC9687pc) {
        if (interfaceC9687pc == null) {
            return new C9680ow();
        }
        List list = interfaceC9687pc.get();
        return list == null ? new C9680ow() : list;
    }

    public void ThreeDS2Service(Reader reader) {
        this.valueOf.get(reader);
        values();
    }

    public Object values(String str, InterfaceC9687pc interfaceC9687pc) throws C9683oz {
        try {
            return get(new StringReader(str), interfaceC9687pc);
        } catch (IOException e) {
            throw new C9683oz(-1, 2, e);
        }
    }

    public int ThreeDS2Service() {
        return this.valueOf.valueOf();
    }
}
