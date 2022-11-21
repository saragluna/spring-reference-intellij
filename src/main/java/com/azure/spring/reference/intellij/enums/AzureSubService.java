package com.azure.spring.reference.intellij.enums;

public enum AzureSubService {

    storage(AzureService.Storage),
    blobs(AzureService.Storage),
    queues(AzureService.Storage),
    fileShare(AzureService.Storage),

    keyVault(AzureService.KeyVault),
    secrets(AzureService.KeyVault),
    certificates(AzureService.KeyVault),
    ;

    private final AzureService service;

    AzureSubService(AzureService service) {
        this.service = service;
    }

    public AzureService getService() {
        return service;
    }
}
