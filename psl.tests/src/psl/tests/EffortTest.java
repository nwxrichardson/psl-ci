/**
 */
package psl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import psl.Effort;
import psl.PslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Effort</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EffortTest extends TestCase {

	/**
	 * The fixture for this Effort test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Effort fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EffortTest.class);
	}

	/**
	 * Constructs a new Effort test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffortTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Effort test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Effort fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Effort test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Effort getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PslFactory.eINSTANCE.createEffort());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EffortTest
