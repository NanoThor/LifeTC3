/**
 */
package com.github.nanothor.lifetc3.ide.lifeTC3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.nanothor.lifetc3.ide.lifeTC3.Variable#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.nanothor.lifetc3.ide.lifeTC3.LifeTC3Package#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see com.github.nanothor.lifetc3.ide.lifeTC3.LifeTC3Package#getVariable_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

} // Variable
