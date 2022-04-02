package model.services;

import java.util.List;

import model.dao.DepartmentDao;
import model.dao.impl.DaoFactory;
import model.entities.Department;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
    
}