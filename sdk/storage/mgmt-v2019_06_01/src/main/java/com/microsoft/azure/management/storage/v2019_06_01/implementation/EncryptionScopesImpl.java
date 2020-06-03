/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2019_06_01.EncryptionScopes;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.storage.v2019_06_01.EncryptionScope;

class EncryptionScopesImpl extends WrapperImpl<EncryptionScopesInner> implements EncryptionScopes {
    private final StorageManager manager;

    EncryptionScopesImpl(StorageManager manager) {
        super(manager.inner().encryptionScopes());
        this.manager = manager;
    }

    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public EncryptionScopeImpl define(String name) {
        return wrapModel(name);
    }

    private EncryptionScopeImpl wrapModel(EncryptionScopeInner inner) {
        return  new EncryptionScopeImpl(inner, manager());
    }

    private EncryptionScopeImpl wrapModel(String name) {
        return new EncryptionScopeImpl(name, this.manager());
    }

    @Override
    public Observable<EncryptionScope> listAsync(final String resourceGroupName, final String accountName) {
        EncryptionScopesInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<EncryptionScopeInner>, Iterable<EncryptionScopeInner>>() {
            @Override
            public Iterable<EncryptionScopeInner> call(Page<EncryptionScopeInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EncryptionScopeInner, EncryptionScope>() {
            @Override
            public EncryptionScope call(EncryptionScopeInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<EncryptionScope> getAsync(String resourceGroupName, String accountName, String encryptionScopeName) {
        EncryptionScopesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, encryptionScopeName)
        .flatMap(new Func1<EncryptionScopeInner, Observable<EncryptionScope>>() {
            @Override
            public Observable<EncryptionScope> call(EncryptionScopeInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((EncryptionScope)wrapModel(inner));
                }
            }
       });
    }

}