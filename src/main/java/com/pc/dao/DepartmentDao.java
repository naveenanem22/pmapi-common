package com.pc.dao;

import java.util.List;

import com.pc.model.Department;

public interface DepartmentDao {

	List<Department> getDepartments();

	int createDepartment(Department department);

	boolean updateDapartment(Department department);

	boolean deleteDepartmentById(int departmentId);

}
