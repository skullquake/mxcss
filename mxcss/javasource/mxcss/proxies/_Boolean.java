// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxcss.proxies;

public class _Boolean extends mxcss.proxies.Value
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxCSS._Boolean";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_Value("_Value"),
		idx("idx"),
		Var_Value("MxCSS.Var_Value");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public _Boolean(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxCSS._Boolean"));
	}

	protected _Boolean(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject _BooleanMendixObject)
	{
		super(context, _BooleanMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MxCSS._Boolean", _BooleanMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxCSS._Boolean");
	}

	/**
	 * @deprecated Use '_Boolean.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxcss.proxies._Boolean initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxcss.proxies._Boolean.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxcss.proxies._Boolean initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxcss.proxies._Boolean(context, mendixObject);
	}

	public static mxcss.proxies._Boolean load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxcss.proxies._Boolean.initialize(context, mendixObject);
	}

	public static java.util.List<mxcss.proxies._Boolean> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxcss.proxies._Boolean> result = new java.util.ArrayList<mxcss.proxies._Boolean>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxCSS._Boolean" + xpathConstraint))
			result.add(mxcss.proxies._Boolean.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of _Value
	 */
	public final java.lang.Boolean get_Value()
	{
		return get_Value(getContext());
	}

	/**
	 * @param context
	 * @return value of _Value
	 */
	public final java.lang.Boolean get_Value(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames._Value.toString());
	}

	/**
	 * Set value of _Value
	 * @param _value
	 */
	public final void set_Value(java.lang.Boolean _value)
	{
		set_Value(getContext(), _value);
	}

	/**
	 * Set value of _Value
	 * @param context
	 * @param _value
	 */
	public final void set_Value(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean _value)
	{
		getMendixObject().setValue(context, MemberNames._Value.toString(), _value);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxcss.proxies._Boolean that = (mxcss.proxies._Boolean) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MxCSS._Boolean";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
