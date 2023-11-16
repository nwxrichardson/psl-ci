/**
 */
package psl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import psl.Deliverable;
import psl.PslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeliverableTest extends TestCase {

	/**
	 * The fixture for this Deliverable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Deliverable fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeliverableTest.class);
	}

	/**
	 * Constructs a new Deliverable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Deliverable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Deliverable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Deliverable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Deliverable getFixture() {
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
		setFixture(PslFactory.eINSTANCE.createDeliverable());
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

} //DeliverableTest
