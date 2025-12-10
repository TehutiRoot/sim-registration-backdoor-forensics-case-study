package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Maps;
import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes4.dex */
public class FileDataStoreFactory extends AbstractDataStoreFactory {

    /* renamed from: e */
    public static final boolean f52386e = StandardSystemProperty.OS_NAME.value().toLowerCase(Locale.ENGLISH).startsWith("windows");

    /* renamed from: d */
    public final File f52387d;

    /* renamed from: com.google.api.client.util.store.FileDataStoreFactory$a */
    /* loaded from: classes4.dex */
    public static class C7327a extends AbstractMemoryDataStore {

        /* renamed from: d */
        public final File f52388d;

        public C7327a(FileDataStoreFactory fileDataStoreFactory, File file, String str) {
            super(fileDataStoreFactory, str);
            File file2 = new File(file, str);
            this.f52388d = file2;
            if (!IOUtils.isSymbolicLink(file2)) {
                if (file2.createNewFile()) {
                    this.keyValueMap = Maps.newHashMap();
                    save();
                    return;
                }
                this.keyValueMap = (HashMap) IOUtils.deserialize(new FileInputStream(file2));
                return;
            }
            throw new IOException("unable to use a symbolic link: " + file2);
        }

        @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
        /* renamed from: a */
        public FileDataStoreFactory getDataStoreFactory() {
            return (FileDataStoreFactory) super.getDataStoreFactory();
        }

        @Override // com.google.api.client.util.store.AbstractMemoryDataStore
        public void save() {
            IOUtils.serialize(this.keyValueMap, new FileOutputStream(this.f52388d));
        }
    }

    public FileDataStoreFactory(File file) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        if (!IOUtils.isSymbolicLink(canonicalFile)) {
            if (!canonicalFile.exists() && !canonicalFile.mkdirs()) {
                throw new IOException("unable to create directory: " + canonicalFile);
            }
            this.f52387d = canonicalFile;
            if (f52386e) {
                m41684b(canonicalFile);
                return;
            } else {
                m41685a(canonicalFile);
                return;
            }
        }
        throw new IOException("unable to use a symbolic link: " + canonicalFile);
    }

    /* renamed from: a */
    public static void m41685a(File file) {
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        PosixFilePermission posixFilePermission3;
        Path path;
        HashSet hashSet = new HashSet();
        posixFilePermission = PosixFilePermission.OWNER_READ;
        hashSet.add(posixFilePermission);
        posixFilePermission2 = PosixFilePermission.OWNER_WRITE;
        hashSet.add(posixFilePermission2);
        posixFilePermission3 = PosixFilePermission.OWNER_EXECUTE;
        hashSet.add(posixFilePermission3);
        try {
            path = Paths.get(file.getAbsolutePath(), new String[0]);
            Files.setPosixFilePermissions(path, hashSet);
        } catch (RuntimeException e) {
            throw new IOException("Unable to set permissions for " + file, e);
        }
    }

    /* renamed from: b */
    public static void m41684b(File file) {
        Path path;
        FileAttributeView fileAttributeView;
        UserPrincipal owner;
        FileAttributeView fileAttributeView2;
        AclEntryPermission aclEntryPermission;
        AclEntryPermission aclEntryPermission2;
        AclEntryPermission aclEntryPermission3;
        AclEntryPermission aclEntryPermission4;
        AclEntryPermission aclEntryPermission5;
        AclEntryPermission aclEntryPermission6;
        AclEntryPermission aclEntryPermission7;
        AclEntryPermission aclEntryPermission8;
        AclEntryPermission aclEntryPermission9;
        AclEntryPermission aclEntryPermission10;
        AclEntryPermission aclEntryPermission11;
        AclEntryPermission aclEntryPermission12;
        AclEntryPermission aclEntryPermission13;
        AclEntry.Builder newBuilder;
        AclEntryType aclEntryType;
        AclEntry.Builder type;
        AclEntry.Builder principal;
        AclEntry.Builder permissions;
        AclEntry build;
        path = Paths.get(file.getAbsolutePath(), new String[0]);
        fileAttributeView = Files.getFileAttributeView(path, AbstractC0327EW.m68491a(), new LinkOption[0]);
        owner = AbstractC1103PW.m66793a(fileAttributeView).getOwner();
        fileAttributeView2 = Files.getFileAttributeView(path, AbstractC1251RW.m66445a(), new LinkOption[0]);
        AclFileAttributeView m66321a = AbstractC1322SW.m66321a(fileAttributeView2);
        aclEntryPermission = AclEntryPermission.APPEND_DATA;
        aclEntryPermission2 = AclEntryPermission.DELETE;
        aclEntryPermission3 = AclEntryPermission.DELETE_CHILD;
        aclEntryPermission4 = AclEntryPermission.READ_ACL;
        aclEntryPermission5 = AclEntryPermission.READ_ATTRIBUTES;
        aclEntryPermission6 = AclEntryPermission.READ_DATA;
        aclEntryPermission7 = AclEntryPermission.READ_NAMED_ATTRS;
        aclEntryPermission8 = AclEntryPermission.SYNCHRONIZE;
        aclEntryPermission9 = AclEntryPermission.WRITE_ACL;
        aclEntryPermission10 = AclEntryPermission.WRITE_ATTRIBUTES;
        aclEntryPermission11 = AclEntryPermission.WRITE_DATA;
        aclEntryPermission12 = AclEntryPermission.WRITE_NAMED_ATTRS;
        aclEntryPermission13 = AclEntryPermission.WRITE_OWNER;
        ImmutableSet m40925of = ImmutableSet.m40925of(aclEntryPermission, aclEntryPermission2, aclEntryPermission3, aclEntryPermission4, aclEntryPermission5, aclEntryPermission6, aclEntryPermission7, aclEntryPermission8, aclEntryPermission9, aclEntryPermission10, aclEntryPermission11, aclEntryPermission12, aclEntryPermission13);
        newBuilder = AclEntry.newBuilder();
        aclEntryType = AclEntryType.ALLOW;
        type = newBuilder.setType(aclEntryType);
        principal = type.setPrincipal(owner);
        permissions = principal.setPermissions(m40925of);
        build = permissions.build();
        try {
            m66321a.setAcl(ImmutableList.m40997of(build));
        } catch (SecurityException e) {
            throw new IOException("Unable to set permissions for " + file, e);
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStoreFactory
    public <V extends Serializable> DataStore<V> createDataStore(String str) throws IOException {
        return new C7327a(this, this.f52387d, str);
    }

    public final File getDataDirectory() {
        return this.f52387d;
    }
}
