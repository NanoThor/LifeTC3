/**
 */
package com.github.nanothor.lifetc3.ide.lifeTC3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.nanothor.lifetc3.ide.lifeTC3.LifeTC3Factory
 * @model kind="package"
 * @generated
 */
public interface LifeTC3Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lifeTC3";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.github.com/nanothor/lifetc3/ide/LifeTC3";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lifeTC3";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LifeTC3Package eINSTANCE = com.github.nanothor.lifetc3.ide.lifeTC3.impl.LifeTC3PackageImpl.init();

  /**
   * The meta object id for the '{@link com.github.nanothor.lifetc3.ide.lifeTC3.impl.ProgImpl <em>Prog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.ProgImpl
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.LifeTC3PackageImpl#getProg()
   * @generated
   */
  int PROG = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG__NAME = 0;

  /**
   * The feature id for the '<em><b>Vc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG__VC = 1;

  /**
   * The number of structural features of the '<em>Prog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.nanothor.lifetc3.ide.lifeTC3.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.VariableImpl
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.LifeTC3PackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAMES = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.nanothor.lifetc3.ide.lifeTC3.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.ConstantImpl
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.LifeTC3PackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.github.nanothor.lifetc3.ide.lifeTC3.Prog <em>Prog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prog</em>'.
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.Prog
   * @generated
   */
  EClass getProg();

  /**
   * Returns the meta object for the attribute '{@link com.github.nanothor.lifetc3.ide.lifeTC3.Prog#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.Prog#getName()
   * @see #getProg()
   * @generated
   */
  EAttribute getProg_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.nanothor.lifetc3.ide.lifeTC3.Prog#getVc <em>Vc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vc</em>'.
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.Prog#getVc()
   * @see #getProg()
   * @generated
   */
  EReference getProg_Vc();

  /**
   * Returns the meta object for class '{@link com.github.nanothor.lifetc3.ide.lifeTC3.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute list '{@link com.github.nanothor.lifetc3.ide.lifeTC3.Variable#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.Variable#getNames()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Names();

  /**
   * Returns the meta object for class '{@link com.github.nanothor.lifetc3.ide.lifeTC3.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link com.github.nanothor.lifetc3.ide.lifeTC3.Constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.Constant#getName()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LifeTC3Factory getLifeTC3Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.github.nanothor.lifetc3.ide.lifeTC3.impl.ProgImpl <em>Prog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.ProgImpl
     * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.LifeTC3PackageImpl#getProg()
     * @generated
     */
    EClass PROG = eINSTANCE.getProg();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROG__NAME = eINSTANCE.getProg_Name();

    /**
     * The meta object literal for the '<em><b>Vc</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROG__VC = eINSTANCE.getProg_Vc();

    /**
     * The meta object literal for the '{@link com.github.nanothor.lifetc3.ide.lifeTC3.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.VariableImpl
     * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.LifeTC3PackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAMES = eINSTANCE.getVariable_Names();

    /**
     * The meta object literal for the '{@link com.github.nanothor.lifetc3.ide.lifeTC3.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.ConstantImpl
     * @see com.github.nanothor.lifetc3.ide.lifeTC3.impl.LifeTC3PackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

  }

} //LifeTC3Package
