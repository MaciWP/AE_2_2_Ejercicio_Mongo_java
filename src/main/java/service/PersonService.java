package service;

import model.Person;
import dao.GenericDAO;
import java.util.List;
import static utils.Constants.*;

public abstract class GenericService<T extends Person> {
    protected final GenericDAO<T> dao;

    protected GenericService(GenericDAO<T> dao) {
        this.dao = dao;
    }

    public void showAll() {
        try {
            List<T> entities = dao.findAll();
            for (T entity : entities) {
                System.out.println(entity);
            }
        } catch (Exception e) {
            System.out.println(ERROR_SHOW_GENERAL + e.getMessage());
        }
    }

    public void findByEmail(String email) {
        try {
            T entity = dao.findByEmail(email);
            if (entity != null) {
                System.out.println(entity);
            } else {
                System.out.println(NO_ENTITY_FOUND);
            }
        } catch (Exception e) {
            System.out.println(ERROR_FIND_GENERAL + e.getMessage());
        }
    }

    protected double getValidNumericInput(String prompt, double min, double max) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.printf(ERROR_VALUE_RANGE, min, max);
                System.out.println();
            } catch (Exception e) {
                System.out.println(ERROR_INVALID_NUMBER);
                scanner.nextLine(); // Clear buffer
            }
        }
    }
}