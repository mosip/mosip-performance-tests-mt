/**
 * 
 */
package mosip.perf.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Superclass for entities
 * 
 * @author Ajay J
 * @since 1.0.0
 *
 */
@Data
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {

	/**
	 * The field createdBy
	 */
	@Column(name = "cr_by", length = 256)
	private String createdBy;

	/**
	 * The field createdtimes
	 */
	@Column(name = "cr_dtimes")
	private LocalDateTime createdtimes;

	/**
	 * The field updatedBy
	 */
	@Column(name = "upd_by", length = 256)
	private String updatedBy;

	/**
	 * The field updatedtimes
	 */
	@Column(name = "upd_dtimes")
	private LocalDateTime updatedtimes;

	/**
	 * The field isDeleted
	 */
	@Column(name = "is_deleted")
	private Boolean isDeleted;

	/**
	 * The field deletedtimes
	 */
	@Column(name = "del_dtimes")
	private LocalDateTime deletedtimes;

}