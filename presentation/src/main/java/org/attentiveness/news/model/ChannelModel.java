package org.attentiveness.news.model;

/**
 * Channel Model
 */
public class ChannelModel {

    private String id;
    private String name;

    public ChannelModel(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        stringBuilder.append("********** Channel ***********").append("\n");
        stringBuilder.append("id = ").append(this.getId()).append("\n");
        stringBuilder.append("name = ").append(this.getName()).append("\n");
        stringBuilder.append("********** Channel ***********").append("\n");
        return stringBuilder.toString();
    }
}
