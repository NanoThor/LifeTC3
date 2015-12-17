/**
 */
package com.github.nanothor.lifetc3.ide.lifeTC3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.nanothor.lifetc3.ide.lifeTC3.Prog#getName <em>Name</em>}</li>
 *   <li>{@link com.github.nanothor.lifetc3.ide.lifeTC3.Prog#getVc <em>Vc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.nanothor.lifetc3.ide.lifeTC3.LifeTC3Package#getProg()
 * @model
 * @generated
 */
public interface Prog extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.LifeTC3Package#getProg_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.nanothor.lifetc3.ide.lifeTC3.Prog#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vc</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vc</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vc</em>' containment reference list.
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.LifeTC3Package#getProg_Vc()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getVc();

} // Prog
