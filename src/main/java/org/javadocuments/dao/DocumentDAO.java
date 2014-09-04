package org.javadocuments.dao;

import java.util.List;
import org.javadocuments.domain.Document;

public interface DocumentDAO {

    public Document getDocumentById(int id);
    public int addDocument(Document document);
    public boolean updateDocument(Document document);
    public boolean deleteDocument(int id);
    public List<Document> getAllDocuments();
    public void addBatchDocuments(final List<Document> documentList);

}