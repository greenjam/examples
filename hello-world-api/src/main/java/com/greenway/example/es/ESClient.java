package com.greenway.example.es;

import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeBuilder;

public class ESClient {

    Node node;

    public ESClient(){
        buildNode();
    }

    private void buildNode(){
        node = NodeBuilder.nodeBuilder()
                .client(true)
                .clusterName("product")
                .data(false)
                .build();
    }

    public Client getClient(){
        return node.client();
    }

    public BulkRequestBuilder getBulkBuilder(){
       return node.client().prepareBulk();
    }

    public IndexRequestBuilder getIndexBuilder(String id){
        return node.client().prepareIndex("product","product",id);
    }
}
