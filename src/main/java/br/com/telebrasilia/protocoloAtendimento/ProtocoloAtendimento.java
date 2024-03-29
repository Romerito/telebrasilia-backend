package br.com.telebrasilia.protocoloAtendimento;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.hateoas.RepresentationModel;

import br.com.telebrasilia.enums.ProtocoloStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * @author  Romerito Alencar
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "protocolo_atendimento")
public class ProtocoloAtendimento extends RepresentationModel<ProtocoloAtendimento> {

    @Id
    @GeneratedValue
	private Long idProtocolo;
	@Column(name = "CPF_CNPJ")
    private String cpfCnpj;
	private Long idCliente;
	private String nuProtocolo;
	private String noSolicitante;
	private String tpSolicitacao;
	private Date dtAbertura;
	private Date dtExecucao;
	private String hrExecucao;
	private String dtSolucao;
	private String nuTelefone;
	@Enumerated(EnumType.STRING)
	private ProtocoloStatusEnum stProtocolo;
	private String coUsuario;
	private String observacao;

}
