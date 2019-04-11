-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Mar-2019 às 02:11
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eletromarc`
--
CREATE DATABASE IF NOT EXISTS `eletromarc` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `eletromarc`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcliente`
--

DROP TABLE IF EXISTS `tbcliente`;
CREATE TABLE IF NOT EXISTS `tbcliente` (
  `COD_CLIENTE` int(5) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) CHARACTER SET utf8 NOT NULL,
  `DATA_NASCIMENTO` date NOT NULL,
  `TELEFONE` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `CELULAR` varchar(11) CHARACTER SET utf8 NOT NULL,
  `CPF` varchar(11) CHARACTER SET utf8 NOT NULL,
  `RG` varchar(9) CHARACTER SET utf8 DEFAULT NULL,
  `EMAIL` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `RUA` varchar(50) CHARACTER SET utf8 NOT NULL,
  `RUA_NUMERO` int(5)NOT NULL,
  `CEP` varchar(8) CHARACTER SET utf8 DEFAULT NULL,
  `BAIRRO` varchar(30) CHARACTER SET utf8 NOT NULL,
  `CIDADE` varchar(50) CHARACTER SET utf8 NOT NULL,
  `COMPLEMENTO` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `ESTADO` varchar(2) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`COD_CLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfabricante`
--

DROP TABLE IF EXISTS `tbfabricante`;
CREATE TABLE IF NOT EXISTS `tbfabricante` (
  `COD_FABRICANTE` int(5) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) NOT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL,
  `CELULAR` varchar(11) NOT NULL,
  `CNPJ` varchar(14) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `RUA` varchar(50) NOT NULL,
  `RUA_NUMERO` int(5) NOT NULL,
  `CEP` varchar(8) DEFAULT NULL,
  `BAIRRO` varchar(30) NOT NULL,
  `CIDADE` varchar(50) NOT NULL,
  `COMPLEMENTO` varchar(100) NOT NULL,
  `ESTADO` varchar(2) NOT NULL,
  PRIMARY KEY (`COD_FABRICANTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `tbfabricante` VALUES
(1, 'LG', '1433441143', '14997418553', 'gaandrade76@hotmail.com', 'washington luiz', 2020, '18950000', 'centro', 'ipaussu', 'fundos', '525780543', 'SP');


-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfornecedor`
--

DROP TABLE IF EXISTS `tbfornecedor`;
CREATE TABLE IF NOT EXISTS `tbfornecedor` (
  `COD_FORNECEDOR` int(5) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) NOT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL,
  `CELULAR` varchar(11) NOT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `RUA` varchar(50) NOT NULL,
  `RUA_NUMERO` int(5) NOT NULL,
  `CEP` varchar(8) DEFAULT NULL,
  `BAIRRO` varchar(30) NOT NULL,
  `CIDADE` varchar(50) NOT NULL,
  `COMPLEMENTO` varchar(100) DEFAULT NULL,
  `ESTADO` varchar(2) NOT NULL,
  `CNPJ` varchar(14) NOT NULL,
  PRIMARY KEY (`COD_FORNECEDOR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `tbfornecedor` VALUES
(1, 'Raionix', '1433441143', '14997418553', 'gaandrade76@hotmail.com', 'washington luiz', 2020, '18950000', 'centro', 'ipaussu', 'fundos', '525780543', 'SP');



-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfuncionario`
--

DROP TABLE IF EXISTS `tbfuncionario`;
CREATE TABLE IF NOT EXISTS `tbfuncionario` (
  `COD_FUNCIONARIO` int(5) NOT NULL AUTO_INCREMENT,
  `NOME_FUNCIONARIO` varchar(50) NOT NULL,
  `DATA_NASCIMENTO` date NOT NULL,
  `TELEFONE` varchar(20) DEFAULT NULL,
  `CELULAR` varchar(15) NOT NULL,
  `CPF` varchar(13) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `RUA` varchar(50) NOT NULL,
  `RUA_NUMERO` int(5) NOT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `BAIRRO` varchar(50) NOT NULL,
  `CIDADE` varchar(30) NOT NULL,
  `COMPLEMENTO` varchar(100) NOT NULL,
  `RG` varchar(9) DEFAULT NULL,
  `ESTADO` varchar(2) NOT NULL,
  PRIMARY KEY (`COD_FUNCIONARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbfuncionario`
--

INSERT INTO `tbfuncionario` (`COD_FUNCIONARIO`, `NOME_FUNCIONARIO`, `DATA_NASCIMENTO`, `TELEFONE`, `CELULAR`, `CPF`, `EMAIL`, `RUA`, `RUA_NUMERO`, `CEP`, `BAIRRO`, `CIDADE`, `COMPLEMENTO`, `RG`, `ESTADO`) VALUES
(1, 'Gabriel Andrade Rocha', '1999-06-10', '1433441143', '14997418553', '46939682856', 'gaandrade76@hotmail.com', 'washington luiz', 2020, '18950000', 'centro', 'ipaussu', 'fundos', '525780543', 'SP');

INSERT INTO `tbcliente` VALUES
(1, 'Gabriel Andrade Rocha', '1999-06-10', '1433441143', '14997418553', '46939682856', 'gaandrade76@hotmail.com', 'washington luiz', 2020, '18950000', 'centro', 'ipaussu', 'fundos', '525780543', 'SP');



-- --------------------------------------------------------

--
-- Estrutura da tabela `tbgarantiafornecedor`
--

DROP TABLE IF EXISTS `tbgarantiafornecedor`;
CREATE TABLE IF NOT EXISTS `tbgarantiafornecedor` (
  `COD_GARANTIA_FORNECEDOR` int(5) NOT NULL AUTO_INCREMENT,
  `COD_MERCADORIA` int(5) NOT NULL,
  `DATA` date NOT NULL,
  `VALOR_PAGO` float(7,2) NOT NULL,
  `NOME` varchar(50) NOT NULL,
  PRIMARY KEY (`COD_GARANTIA_FORNECEDOR`),
  KEY `FK_GARANTIAFORNECEDOR_CODMERCADORIA` (`COD_MERCADORIA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbmercadoria`
--

DROP TABLE IF EXISTS `tbmercadoria`;
CREATE TABLE IF NOT EXISTS `tbmercadoria` (
  `COD_MERCADORIA` int(5) NOT NULL AUTO_INCREMENT,
  `COD_FABRICANTE` int(5) NOT NULL,
  `COD_FORNECEDOR` int(5) NOT NULL,
  `MARCA` varchar(50) NOT NULL,
  `MODELO` varchar(50) NOT NULL,
  `CUSTO` float(7,2) NOT NULL,
  `NOME` varchar(50) NOT NULL,
  PRIMARY KEY (`COD_MERCADORIA`),
  KEY `FK_MERCADORIA_CODFABRICANTE` (`COD_FABRICANTE`),
  KEY `FK_MERCADORIA_CODFORNECEDOR` (`COD_FORNECEDOR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `tbmercadoria` VALUES
(1, 1, 1, 'Samsung', 'TV', '1299.00', 'Ultra4k');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tborcamento`
--

DROP TABLE IF EXISTS `tborcamento`;
CREATE TABLE IF NOT EXISTS `tborcamento` (
  `COD_ORCAMENTO` int(5) NOT NULL AUTO_INCREMENT,
  `COD_MERCADORIA` int(5) NOT NULL,
  `COD_CLIENTE` int(5) NOT NULL,
  `SERVICO_SOLICITADO` varchar(200) NOT NULL,
  `DESCRICAO` varchar(200) NOT NULL,
  `DATA` date NOT NULL,
  `VALOR_MERCADORIA` float(7,2) NOT NULL,
  `VALOR_MAO_OBRA` float(7,2) NOT NULL,
  `VALOR_TOTAL` float(7,2) NOT NULL,
  `STATUS` varchar(50) NOT NULL,
  PRIMARY KEY (`COD_ORCAMENTO`),
  KEY `FK_ORCAMENTO_CODCLIENTE` (`COD_CLIENTE`),
  KEY `FK_ORCAMENTO_CODMERCADORIA` (`COD_MERCADORIA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbpagamento`
--

DROP TABLE IF EXISTS `tbpagamento`;
CREATE TABLE IF NOT EXISTS `tbpagamento` (
  `COD_PAGAMENTO` int(5) NOT NULL AUTO_INCREMENT,
  `COD_CLIENTE` int(5) NOT NULL,
  `FORMA_PAGAMENTO` varchar(50) NOT NULL,
  `DESCONTO` float(7,2) NOT NULL,
  `DATA_PAGAMENTO` datetime NOT NULL,
  `TOTAL` float NOT NULL,
  PRIMARY KEY (`COD_PAGAMENTO`),
  KEY `FK_PAGAMENTO_CODCLIENTE` (`COD_CLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbprestacaoservico`
--

DROP TABLE IF EXISTS `tbprestacaoservico`;
CREATE TABLE IF NOT EXISTS `tbprestacaoservico` (
  `COD_PRESTACAO_SERVICO` int(5) NOT NULL AUTO_INCREMENT,
  `NOME_PRESTACAO` varchar(100) NOT NULL,
  `DATA` date DEFAULT NULL,
  `VALOR_PAGO` float(7,2) NOT NULL,
  `DESCRICAO` varchar(200) NOT NULL,
  PRIMARY KEY (`COD_PRESTACAO_SERVICO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbsaidamercadoria`
--

DROP TABLE IF EXISTS `tbsaidamercadoria`;
CREATE TABLE IF NOT EXISTS `tbsaidamercadoria` (
  `COD_SAIDA_MERCADORIA` int(5) NOT NULL AUTO_INCREMENT,
  `COD_MERCADORIA` int(5) NOT NULL,
  `MOTIVO_SAIDA` varchar(200) NOT NULL,
  `DATA_SAIDA` datetime NOT NULL,
  `VALOR` float(7,2) NOT NULL,
  PRIMARY KEY (`COD_SAIDA_MERCADORIA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

DROP TABLE IF EXISTS `tbusuario`;
CREATE TABLE IF NOT EXISTS `tbusuario` (
  `COD_USUARIO` int(5) NOT NULL,
  `COD_FUNCIONARIO` int(5) NOT NULL,
  `LOGIN` varchar(50) NOT NULL,
  `SENHA` varchar(50) NOT NULL,
  `PERFIL` varchar(25) NOT NULL,
  PRIMARY KEY (`LOGIN`),
  KEY `FK_USUARIO_CODFUNCIONARIO` (`COD_FUNCIONARIO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tbgarantiafornecedor`
--
ALTER TABLE `tbgarantiafornecedor`
  ADD CONSTRAINT `FK_GARANTIAFORNECEDOR_CODMERCADORIA` FOREIGN KEY (`COD_MERCADORIA`) REFERENCES `tbmercadoria` (`COD_MERCADORIA`);

--
-- Limitadores para a tabela `tbmercadoria`
--
ALTER TABLE `tbmercadoria`
  ADD CONSTRAINT `FK_MERCADORIA_CODFABRICANTE` FOREIGN KEY (`COD_FABRICANTE`) REFERENCES `tbfabricante` (`COD_FABRICANTE`),
  ADD CONSTRAINT `FK_MERCADORIA_CODFORNECEDOR` FOREIGN KEY (`COD_FORNECEDOR`) REFERENCES `tbfornecedor` (`COD_FORNECEDOR`);

--
-- Limitadores para a tabela `tborcamento`
--
ALTER TABLE `tborcamento`
  ADD CONSTRAINT `FK_ORCAMENTO_CODCLIENTE` FOREIGN KEY (`COD_CLIENTE`) REFERENCES `tbcliente` (`COD_CLIENTE`),

  ADD CONSTRAINT `FK_ORCAMENTO_CODMERCADORIA` FOREIGN KEY (`COD_MERCADORIA`) REFERENCES `tbmercadoria` (`COD_MERCADORIA`);

--
-- Limitadores para a tabela `tbpagamento`
--
ALTER TABLE `tbpagamento`
  ADD CONSTRAINT `FK_PAGAMENTO_CODCLIENTE` FOREIGN KEY (`COD_CLIENTE`) REFERENCES `tbcliente` (`COD_CLIENTE`);

--
-- Limitadores para a tabela `tbusuario`
--
ALTER TABLE `tbusuario`
  ADD CONSTRAINT `FK_USUARIO_CODFUNCIONARIO` FOREIGN KEY (`COD_FUNCIONARIO`) REFERENCES `tbfuncionario` (`COD_FUNCIONARIO`);

--
-- Limitadores para a tabela `tbsaidamercadoria`
--
ALTER TABLE `tbsaidamercadoria`
  ADD CONSTRAINT `FK_SAIDAMERCADORIA_CODMERCADORIA`FOREIGN KEY
(`COD_MERCADORIA`) REFERENCES `tbmercadoria` (`COD_MERCADORIA`);

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;