package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import model.Person;
import utils.DatabaseConnection;
import java.util.ArrayList;
import java.util.List;

public abstract class PersonDAO<T extends Person> {
    protected final MongoCollection<T> collection;
    protected final Class<T> entityClass;

    protected PersonDAO(String collectionName, Class<T> entityClass) {
        this.entityClass = entityClass;
        MongoDatabase database = DatabaseConnection.getDatabase();
        this.collection = database.getCollection(collectionName, entityClass);
    }

    public void insert(T entity) {
        collection.insertOne(entity);
    }

    public List<T> findAll() {
        return collection.find().into(new ArrayList<>());
    }

    public T findByEmail(String email) {
        return collection.find(Filters.eq("email", email)).first();
    }

    public List<T> findByAgeRange(int minAge, int maxAge) {
        return collection.find(
                Filters.and(
                        Filters.gte("age", minAge),
                        Filters.lte("age", maxAge)
                )
        ).into(new ArrayList<>());
    }

    public boolean updateRating(String email, double newRating) {
        return collection.updateOne(
                Filters.eq("email", email),
                Filters.set("rating", newRating)
        ).getModifiedCount() > 0;
    }
}
