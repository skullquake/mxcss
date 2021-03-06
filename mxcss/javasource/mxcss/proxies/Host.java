// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxcss.proxies;

public class Host
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject hostMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxCSS.Host";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		url("url"),
		active("active"),
		Entity_Config("MxCSS.Entity_Config");

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

	public Host(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxCSS.Host"));
	}

	protected Host(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject hostMendixObject)
	{
		if (hostMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxCSS.Host", hostMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxCSS.Host");

		this.hostMendixObject = hostMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Host.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxcss.proxies.Host initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxcss.proxies.Host.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxcss.proxies.Host initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxcss.proxies.Host(context, mendixObject);
	}

	public static mxcss.proxies.Host load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxcss.proxies.Host.initialize(context, mendixObject);
	}

	public static java.util.List<mxcss.proxies.Host> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxcss.proxies.Host> result = new java.util.ArrayList<mxcss.proxies.Host>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxCSS.Host" + xpathConstraint))
			result.add(mxcss.proxies.Host.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of url
	 */
	public final java.lang.String geturl()
	{
		return geturl(getContext());
	}

	/**
	 * @param context
	 * @return value of url
	 */
	public final java.lang.String geturl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.url.toString());
	}

	/**
	 * Set value of url
	 * @param url
	 */
	public final void seturl(java.lang.String url)
	{
		seturl(getContext(), url);
	}

	/**
	 * Set value of url
	 * @param context
	 * @param url
	 */
	public final void seturl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.url.toString(), url);
	}

	/**
	 * @return value of active
	 */
	public final java.lang.Boolean getactive()
	{
		return getactive(getContext());
	}

	/**
	 * @param context
	 * @return value of active
	 */
	public final java.lang.Boolean getactive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.active.toString());
	}

	/**
	 * Set value of active
	 * @param active
	 */
	public final void setactive(java.lang.Boolean active)
	{
		setactive(getContext(), active);
	}

	/**
	 * Set value of active
	 * @param context
	 * @param active
	 */
	public final void setactive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean active)
	{
		getMendixObject().setValue(context, MemberNames.active.toString(), active);
	}

	/**
	 * @return value of Entity_Config
	 */
	public final mxcss.proxies.Config getEntity_Config() throws com.mendix.core.CoreException
	{
		return getEntity_Config(getContext());
	}

	/**
	 * @param context
	 * @return value of Entity_Config
	 */
	public final mxcss.proxies.Config getEntity_Config(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxcss.proxies.Config result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Entity_Config.toString());
		if (identifier != null)
			result = mxcss.proxies.Config.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Entity_Config
	 * @param entity_config
	 */
	public final void setEntity_Config(mxcss.proxies.Config entity_config)
	{
		setEntity_Config(getContext(), entity_config);
	}

	/**
	 * Set value of Entity_Config
	 * @param context
	 * @param entity_config
	 */
	public final void setEntity_Config(com.mendix.systemwideinterfaces.core.IContext context, mxcss.proxies.Config entity_config)
	{
		if (entity_config == null)
			getMendixObject().setValue(context, MemberNames.Entity_Config.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Entity_Config.toString(), entity_config.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return hostMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxcss.proxies.Host that = (mxcss.proxies.Host) obj;
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
		return "MxCSS.Host";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
