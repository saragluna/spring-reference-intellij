package com.azure.spring.reference.intellij.configurationProperties;

public class VersionSpec {

    private String artifactId;
    private String gaVersion;
    private String previewVersion;

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getGaVersion() {
        return gaVersion;
    }

    public void setGaVersion(String gaVersion) {
        this.gaVersion = gaVersion;
    }

    public String getPreviewVersion() {
        return previewVersion;
    }

    public void setPreviewVersion(String previewVersion) {
        this.previewVersion = previewVersion;
    }
}
