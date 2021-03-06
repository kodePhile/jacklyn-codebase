/*
 * Copyright 2018-2020 The Code Department.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.tcdng.jacklyn.organization.business;

import java.util.List;
import java.util.Map;

import com.tcdng.jacklyn.common.business.JacklynBusinessService;
import com.tcdng.jacklyn.common.constants.RecordStatus;
import com.tcdng.jacklyn.organization.data.RoleLargeData;
import com.tcdng.jacklyn.organization.entities.Branch;
import com.tcdng.jacklyn.organization.entities.BranchQuery;
import com.tcdng.jacklyn.organization.entities.Department;
import com.tcdng.jacklyn.organization.entities.DepartmentQuery;
import com.tcdng.jacklyn.organization.entities.Hub;
import com.tcdng.jacklyn.organization.entities.HubQuery;
import com.tcdng.jacklyn.organization.entities.Privilege;
import com.tcdng.jacklyn.organization.entities.PrivilegeCategory;
import com.tcdng.jacklyn.organization.entities.PrivilegeCategoryQuery;
import com.tcdng.jacklyn.organization.entities.PrivilegeGroup;
import com.tcdng.jacklyn.organization.entities.PrivilegeGroupQuery;
import com.tcdng.jacklyn.organization.entities.PrivilegeQuery;
import com.tcdng.jacklyn.organization.entities.Role;
import com.tcdng.jacklyn.organization.entities.RolePrivilegeQuery;
import com.tcdng.jacklyn.organization.entities.RolePrivilegeWidget;
import com.tcdng.jacklyn.organization.entities.RolePrivilegeWidgetQuery;
import com.tcdng.jacklyn.organization.entities.RoleQuery;
import com.tcdng.jacklyn.shared.organization.RoleWfStepType;
import com.tcdng.unify.core.UnifyException;

/**
 * Organization business service.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
public interface OrganizationService extends JacklynBusinessService {

    /**
     * Creates a new branch.
     * 
     * @param branch
     *            the branch data
     * @return the created branch ID
     * @throws UnifyException
     *             if an error occurs
     */
    Long createBranch(Branch branch) throws UnifyException;

    /**
     * Finds branch by ID.
     * 
     * @param branchId
     *            the branch ID
     * @return the branch data
     * @throws UnifyException
     *             if branch with ID is not found
     */
    Branch findBranch(Long branchId) throws UnifyException;

    /**
     * Finds branch ID by branch code.
     * 
     * @param branchCode
     *            the branch code to use
     * @return the branch ID
     * @throws UnifyException
     *             if branch identified by supplied code is unknown
     */
    Long findBranchId(String branchCode) throws UnifyException;

    /**
     * Finds branch by criteria.
     * 
     * @param query
     *            the criteria to use
     * @return the branch data if found otherwise null
     * @throws UnifyException
     *             if multiple records found. if an error occurs
     */
    Branch findBranch(BranchQuery query) throws UnifyException;

    /**
     * Finds branches by query.
     * 
     * @param query
     *            the branch query
     * @return the list of branches found
     * @throws UnifyException
     *             if an error occurs
     */
    List<Branch> findBranches(BranchQuery query) throws UnifyException;

    /**
     * Finds branches by query.
     * 
     * @param query
     *            the branch query
     * @return the map of branches found by ID
     * @throws UnifyException
     *             if an error occurs
     */
    Map<Long, Branch> findBranchesMapById(BranchQuery query) throws UnifyException;

    /**
     * Updates a branch.
     * 
     * @param branch
     *            the branch data
     * @return the update count
     * @throws UnifyException
     *             if an error occurs
     */
    int updateBranch(Branch branch) throws UnifyException;

    /**
     * Deletes a branch.
     * 
     * @param id
     *            the branch ID
     * @return the delete count
     * @throws UnifyException
     *             if an error occurs
     */
    int deleteBranch(Long id) throws UnifyException;

    /**
     * Returns branch head office flag.
     * 
     * @param id
     *            the branch ID
     * @return the head office flag
     * @throws UnifyException
     *             if an error occurs
     */
    boolean getBranchHeadOfficeFlag(Long id) throws UnifyException;

    /**
     * Creates a new department.
     * 
     * @param department
     *            the department data
     * @return the created department ID
     * @throws UnifyException
     *             if an error occurs
     */
    Long createDepartment(Department department) throws UnifyException;

    /**
     * Finds department by ID.
     * 
     * @param departmentId
     *            the department ID
     * @return the department data
     * @throws UnifyException
     *             if department with ID is not found
     */
    Department findDepartment(Long departmentId) throws UnifyException;

    /**
     * Finds department by criteria.
     * 
     * @param query
     *            the criteria to use
     * @return the department data if found otherwise null
     * @throws UnifyException
     *             if multiple records found. if an error occurs
     */
    Department findDepartment(DepartmentQuery query) throws UnifyException;

    /**
     * Finds departments by query.
     * 
     * @param query
     *            the department query
     * @return the list of departments found
     * @throws UnifyException
     *             if an error occurs
     */
    List<Department> findDepartments(DepartmentQuery query) throws UnifyException;

    /**
     * Updates a department.
     * 
     * @param department
     *            the department data
     * @return the update count
     * @throws UnifyException
     *             if an error occurs
     */
    int updateDepartment(Department department) throws UnifyException;

    /**
     * Deletes a department.
     * 
     * @param id
     *            the department ID
     * @return the delete count
     * @throws UnifyException
     *             if an error occurs
     */
    int deleteDepartment(Long id) throws UnifyException;

    /**
     * Creates a new hub.
     * 
     * @param hub
     *            the hub data
     * @return the created hub ID
     * @throws UnifyException
     *             if an error occurs
     */
    Long createHub(Hub hub) throws UnifyException;

    /**
     * Finds hub by ID.
     * 
     * @param hubId
     *            the hub ID
     * @return the hub data
     * @throws UnifyException
     *             if hub with ID is not found
     */
    Hub findHub(Long hubId) throws UnifyException;

    /**
     * Finds hub by query.
     * 
     * @param query
     *            the hub query
     * @return the hub record if found otherwise null
     * @throws UnifyException
     *             if hub multiple records are found. If an error occurs
     */
    Hub findHub(HubQuery query) throws UnifyException;

    /**
     * Finds hubs by query.
     * 
     * @param query
     *            the hub query
     * @return the list of hubs found
     * @throws UnifyException
     *             if an error occurs
     */
    List<Hub> findHubs(HubQuery query) throws UnifyException;

    /**
     * Updates a hub.
     * 
     * @param hub
     *            the hub data
     * @return the update count
     * @throws UnifyException
     *             if an error occurs
     */
    int updateHub(Hub hub) throws UnifyException;

    /**
     * Deletes a hub.
     * 
     * @param id
     *            the hub ID
     * @return the delete count
     * @throws UnifyException
     *             if an error occurs
     */
    int deleteHub(Long id) throws UnifyException;

    /**
     * Finds hub branches by hub ID.
     * 
     * @param hubId
     *            the hub ID
     * @return the list of branches found
     * @throws UnifyException
     *             if an error occurs
     */
    List<Branch> findHubBranchesByHub(Long hubId) throws UnifyException;

    /**
     * Finds hub branches by branch ID.
     * 
     * @param branchId
     *            the branch ID
     * @return the list of branches found
     * @throws UnifyException
     *             if an error occurs
     */
    List<Branch> findHubBranchesByBranch(Long branchId) throws UnifyException;

    /**
     * Finds hub branches by hub code.
     * 
     * @param hubCode
     *            the hub code
     * @return the list of branches found
     * @throws UnifyException
     *             if an error occurs
     */
    List<Branch> findHubBranchesByHub(String hubCode) throws UnifyException;

    /**
     * Finds hub branches by branch code.
     * 
     * @param branchCode
     *            the branch code
     * @return the list of branches found
     * @throws UnifyException
     *             if an error occurs
     */
    List<Branch> findHubBranchesByBranch(String branchCode) throws UnifyException;

    /**
     * Finds hub branch IDs by branch code.
     * 
     * @param branchCode
     *            the branch code
     * @return the list of branch IDs found
     * @throws UnifyException
     *             if an error occurs
     */
    List<Long> findHubBranchIdsByBranch(String branchCode) throws UnifyException;

    /**
     * Finds hub by branch code.
     * 
     * @param branchCode
     *            the branch code
     * @return the hub
     * @throws UnifyException
     *             if an error occurs
     */
    Hub findHubByBranch(String branchCode) throws UnifyException;

    /**
     * Creates a new role.
     * 
     * @param role
     *            the role data
     * @return the created role ID
     * @throws UnifyException
     *             if an error occurs
     */
    Long createRole(Role role) throws UnifyException;

    /**
     * Creates a new role.
     * 
     * @param roleFormData
     *            the role document
     * @return the created role ID
     * @throws UnifyException
     *             if an error occurs
     */
    Long createRole(RoleLargeData roleFormData) throws UnifyException;

    /**
     * Finds a role by ID.
     * 
     * @param roleId
     *            the role ID
     * @return the role data
     * @throws UnifyException
     *             if role with ID is not found
     */
    Role findRole(Long roleId) throws UnifyException;

    /**
     * Finds role by criteria.
     * 
     * @param query
     *            the criteria to use
     * @return the role data if found otherwise null
     * @throws UnifyException
     *             if multiple records found. if an error occurs
     */
    Role findRole(RoleQuery query) throws UnifyException;

    /**
     * Gets document for specified role.
     * 
     * @param roleId
     *            the role ID
     * @return the role document
     * @throws UnifyException
     *             if an error occurs
     */
    RoleLargeData findRoleForm(Long roleId) throws UnifyException;

    /**
     * Finds roles by query.
     * 
     * @param query
     *            the role query
     * @return the list of roles found
     * @throws UnifyException
     *             if an error occurs
     */
    List<Role> findRoles(RoleQuery query) throws UnifyException;

    /**
     * Updates a role.
     * 
     * @param role
     *            the role
     * @return the update count
     * @throws UnifyException
     *             if an error occurs
     */
    int updateRole(Role role) throws UnifyException;

    /**
     * Updates a role.
     * 
     * @param roleFormData
     *            the role document
     * @return the update count
     * @throws UnifyException
     *             if an error occurs
     */
    int updateRole(RoleLargeData roleFormData) throws UnifyException;

    /**
     * Deletes a role.
     * 
     * @param id
     *            the role ID
     * @return the delete count
     * @throws UnifyException
     *             if an error occurs
     */
    int deleteRole(Long id) throws UnifyException;

    /**
     * Gets the supplied role dashboard.
     * 
     * @param roleName
     *            the role name
     * @return the dashboard entity name
     * @throws UnifyException
     *             if an error occurs
     */
    String getRoleDashboard(String roleName) throws UnifyException;

    /**
     * Registers a privilege category. Performs an update if existing otherwise
     * creates a new record.
     * 
     * @param categoryName
     *            the category code
     * @param descriptionKey
     *            the category description key
     * @return the record ID
     * @throws UnifyException
     *             if an error occurs
     */
    Long registerPrivilegeCategory(String categoryName, String descriptionKey) throws UnifyException;

    /**
     * Registers a privilege under specified category and module.
     * 
     * @param categoryName
     *            the privilege category code
     * @param moduleName
     *            the module code
     * @param privilegeName
     *            the privilege code
     * @param privilegeDesc
     *            the privilege description
     * @return the registered privilege ID
     * @throws UnifyException
     *             if an error occurs
     */
    Long registerPrivilege(String categoryName, String moduleName, String privilegeName, String privilegeDesc)
            throws UnifyException;

    /**
     * Updates a registered privilege.
     * 
     * @param categoryName
     *            the privilege category code
     * @param moduleName
     *            the module code
     * @param privilegeName
     *            the privilege code
     * @param privilegeDesc
     *            the privilege description
     * @return true if privilege was found and successfully updated otherwise false
     * @throws UnifyException
     *             if an error occurs
     */
    boolean updateRegisteredPrivilege(String categoryName, String moduleName, String privilegeName,
            String privilegeDesc) throws UnifyException;

    /**
     * Unregisters a privilege from specified category and module.
     * 
     * @param categoryName
     *            the privilege category code
     * @param moduleName
     *            the module code
     * @param privilegeName
     *            the privilege code
     * @throws UnifyException
     *             if an error occurs
     */
    void unregisterPrivilege(String categoryName, String moduleName, String... privilegeName) throws UnifyException;

    /**
     * Finds privilege category by name.
     * 
     * @param name
     *            the name to search with
     * @return privilege category if found otherwise null
     * @throws UnifyException
     */
    PrivilegeCategory findPrivilegeCategory(String name) throws UnifyException;

    /**
     * Finds privilege categories.
     * 
     * @param query
     *            the search query
     * @return list of privilege categories
     * @throws UnifyException
     *             if an error occurs
     */
    List<PrivilegeCategory> findPrivilegeCategories(PrivilegeCategoryQuery query) throws UnifyException;

    /**
     * Updates a privilege category.
     * 
     * @param privilegeCategory
     *            the privilege category
     * @return the update count
     * @throws UnifyException
     *             if an error occurs
     */
    int updatePrivilegeCategory(PrivilegeCategory privilegeCategory) throws UnifyException;

    /**
     * Finds privilege group using supplied query.
     * 
     * @param query
     *            the query to use
     * @return the privilege group list
     * @throws UnifyException
     *             if an error occurs
     */
    List<PrivilegeGroup> findPrivilegeGroups(PrivilegeGroupQuery query) throws UnifyException;

    /**
     * Finds privileges using suplied query.
     * 
     * @param query
     *            the query to use
     * @return the privilege list
     * @throws UnifyException
     *             if an error occurs
     */
    List<Privilege> findPrivileges(PrivilegeQuery query) throws UnifyException;

    /**
     * Finds privileges IDs using suplied query.
     * 
     * @param query
     *            the query to use
     * @return the privilege ID list
     * @throws UnifyException
     *             if an error occurs
     */
    List<Long> findPrivilegeIds(PrivilegeQuery query) throws UnifyException;

    /**
     * Sets privilege status for specified activity IDs.
     * 
     * @param privilegeIdList
     *            the privilege ID list
     * @return the number of items updated
     * @throws UnifyException
     *             if an error occurs
     */
    int setPrivilegeStatuses(List<Long> privilegeIdList, RecordStatus status) throws UnifyException;

    /**
     * Returns role widget privilege list by supplied query.
     * 
     * @param query
     *            the privilege query
     * @return the privilege ID list
     * @throws UnifyException
     *             if an error occurs
     */
    List<RolePrivilegeWidget> findRoleDocumentControls(RolePrivilegeWidgetQuery query) throws UnifyException;

    /**
     * Updates role widget privileges.
     * 
     * @param rolePrivilegeWidgetList
     *            list of role widget privileges
     * @return number of records updated
     * @throws UnifyException
     *             if an error occurs
     */
    int updateRoleDocumentControls(List<RolePrivilegeWidget> rolePrivilegeWidgetList) throws UnifyException;

    /**
     * Returns privilege ID list by supplied query.
     * 
     * @param query
     *            the privilege query
     * @return the privilege ID list
     * @throws UnifyException
     *             if an error occurs
     */
    List<Long> findPrivilegeIds(RolePrivilegeQuery query) throws UnifyException;

    /**
     * Updates role module privileges.
     * 
     * @param roleId
     *            the role ID
     * @param privilegeIdList
     *            the privilege list
     * @return the update count
     * @throws UnifyException
     *             if an error occurs
     */
    int updateRolePrivileges(Long roleId, List<Long> privilegeIdList) throws UnifyException;

    /**
     * Updates role workflow steps.
     * 
     * @param type
     *            the role workflow step type
     * @param roleId
     *            the role ID
     * @param wfStepIdList
     *            the step id list
     * @return the update count
     * @throws UnifyException
     *             if an error occurs
     */
    int updateRoleWorkflowSteps(RoleWfStepType type, Long roleId, List<Long> wfStepIdList) throws UnifyException;

    /**
     * Loads attributes for roles into application context.
     * 
     * @param roleNames
     *            the role code list
     * @throws UnifyException
     *             if an error occurs
     */
    void loadRoleAttributesToApplication(String... roleNames) throws UnifyException;

    /**
     * Find roles that are tied to a workflow step.
     * 
     * @param type
     *            the role workflow step type
     * @param stepGlobalName
     *            the global workflow step name
     * @return list of role codes
     * @throws UnifyException
     *             if an error occurs
     */
    List<String> findWfStepRoles(RoleWfStepType type, String stepGlobalName) throws UnifyException;

    /**
     * Confirms if supplied role has a certain privilege.
     * 
     * @param roleId
     *            the role ID
     * @param privilegeCatCode
     *            the privilege category code
     * @param privilegeCode
     *            the privilege code
     * @return a true if role has privilege otherwise false
     * @throws UnifyException
     *             if an error occurs
     */
    boolean confirmUserPrivilege(Long roleId, String privilegeCatCode, String privilegeCode) throws UnifyException;

    /**
     * Confirms if at least one of supplied roles has a certain privilege.
     * 
     * @param roleIdList
     *            the role ID list
     * @param privilegeCatCode
     *            the privilege category code
     * @param privilegeCode
     *            the privilege code
     * @return a true if at least one role has privilege otherwise false
     * @throws UnifyException
     *             if an error occurs
     */
    boolean confirmUserPrivilege(List<Long> roleIdList, String privilegeCatCode, String privilegeCode)
            throws UnifyException;
}
