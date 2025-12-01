/**
 * 
 */
package Library_Management_System_Project;

/**
 * 
 */
public interface Borrowable  {
	

	void borrow(int days) throws ltemNotAvailableException;
    void returnItem(int Lastdays);
}