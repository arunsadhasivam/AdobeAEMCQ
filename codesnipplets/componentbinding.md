public class EmpRole  extends WCMUse {

	private List<String> list;
	
	@Override
	public void activate() {
		String roles= getProperties().get("emprolevalue", String.class);
		String[] roleArr = roles.split(",");
		list = new ArrayList<String>();
		for(int i = 0; i<roleArr.length;i++){
			list.add(roleArr[i]);
		}
		 
	}
	

    /**
	 * @return the list
	 */
	public List<String> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<String> list) {
		this.list = list;
	}
}


STEP 2:
========
in page content of AEM /content/employee/emporofile.jsp page 
field properties:
-----------------
emprolevalue - Developer,Tester,manager.

STEP 3:
========

<div id="empRoles" data-sly-use.sr="com.core.components.EmpRole">
            	<table data-sly-list="${sr.list}" class="tblChkBox">
       		        <tr>	
	                    <td colspan="2"><input type="checkbox"  class="chkwidth" id="chkRole${item}"  />
	                    <span>${item @ i18n} </span></td>
		            </tr>
		          </table>
			</div>
      
 improved best way:
 ==================
 
 http://adobe-consulting-services.github.io/
 
 <table data-sly-list.empList="${EMP.empObject.empRoleValue}"class="tblChkBox">
                  <tr>	
                      <td><input type="checkbox"  class="chkwidth" id="chkRole${empList.key}"  />
                      <span>${empList.key @ i18n} </span>
                  </tr>
 </table>
