package com.greenway.example.es;

import com.greenway.example.core.Product;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;


public class BulkIndexer {

    ESClient client;

    public BulkIndexer(ESClient esClient){
        client = esClient;
    }


    public void index(Iterable<Product> data){
        BulkRequestBuilder bulkBuilder = client.getBulkBuilder();

        for(Product product:data){
            bulkBuilder.add(client.getIndexBuilder(String.valueOf(product.getPremierItemNumber()))
                    .setSource(product.getProductMap()));
        }

        BulkResponse bulkResponse = bulkBuilder.execute().actionGet();
        if (bulkResponse.hasFailures()) {
            // process failures by iterating through each bulk response item
        }

    }


}
