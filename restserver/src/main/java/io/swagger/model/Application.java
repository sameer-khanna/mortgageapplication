package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Application
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-08T05:01:30.117Z[GMT]")

public class Application {
	@JsonProperty("mortgageID")
	private String mortgageID = null;

	@JsonProperty("version")
	private Long version = null;

	@JsonProperty("offerID")
	private String offerID = null;

	@JsonProperty("productID")
	private String productID = null;

	@JsonProperty("offerDate")
	private OffsetDateTime offerDate = null;

	@JsonProperty("createdDate")
	private OffsetDateTime createdDate = null;

	@JsonProperty("offerExpired")
	private String offerExpired = null;

	public Application mortgageID(String mortgageID) {
		this.mortgageID = mortgageID;
		return this;
	}

	/**
	 * Get mortgageID
	 * 
	 * @return mortgageID
	 **/
	@ApiModelProperty(value = "")

	public String getMortgageID() {
		return mortgageID;
	}

	public void setMortgageID(String mortgageID) {
		this.mortgageID = mortgageID;
	}

	public Application version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Get version
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "")

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Application offerID(String offerID) {
		this.offerID = offerID;
		return this;
	}

	/**
	 * Get offerID
	 * 
	 * @return offerID
	 **/
	@ApiModelProperty(value = "")

	public String getOfferID() {
		return offerID;
	}

	public void setOfferID(String offerID) {
		this.offerID = offerID;
	}

	public Application productID(String productID) {
		this.productID = productID;
		return this;
	}

	/**
	 * Get productID
	 * 
	 * @return productID
	 **/
	@ApiModelProperty(value = "")

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public Application offerDate(OffsetDateTime offerDate) {
		this.offerDate = offerDate;
		return this;
	}

	/**
	 * Get offerDate
	 * 
	 * @return offerDate
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OffsetDateTime getOfferDate() {
		return offerDate;
	}

	public void setOfferDate(OffsetDateTime offerDate) {
		this.offerDate = offerDate;
	}

	public Application createdDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	/**
	 * Get createdDate
	 * 
	 * @return createdDate
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public OffsetDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Application offerExpired(String offerExpired) {
		this.offerExpired = offerExpired;
		return this;
	}

	/**
	 * Get offerExpired
	 * 
	 * @return offerExpired
	 **/
	@ApiModelProperty(value = "")

	public String getOfferExpired() {
		return offerExpired;
	}

	public void setOfferExpired(String offerExpired) {
		this.offerExpired = offerExpired;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Application application = (Application) o;
		return Objects.equals(this.mortgageID, application.mortgageID)
				&& Objects.equals(this.version, application.version)
				&& Objects.equals(this.offerID, application.offerID)
				&& Objects.equals(this.productID, application.productID)
				&& Objects.equals(this.offerDate, application.offerDate)
				&& Objects.equals(this.createdDate, application.createdDate)
				&& Objects.equals(this.offerExpired, application.offerExpired);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mortgageID, version, offerID, productID, offerDate, createdDate, offerExpired);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Application {\n");

		sb.append("    mortgageID: ").append(toIndentedString(mortgageID)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    offerID: ").append(toIndentedString(offerID)).append("\n");
		sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
		sb.append("    offerDate: ").append(toIndentedString(offerDate)).append("\n");
		sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
		sb.append("    offerExpired: ").append(toIndentedString(offerExpired)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
