-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 19-Mar-2019 às 02:46
-- Versão do servidor: 10.1.19-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eletromarc`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcliente`
--

CREATE TABLE `tbcliente` (
  `COD_CLIENTE` int(5) NOT NULL,
  `NOME` varchar(50) CHARACTER SET utf8 NOT NULL,
  `DATA_NASCIMENTO` date NOT NULL,
  `TELEFONE` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `CELULAR` varchar(11) CHARACTER SET utf8 NOT NULL,
  `CPF` varchar(11) CHARACTER SET utf8 DEFAULT NULL,
  `RG` varchar(9) CHARACTER SET utf8 DEFAULT NULL,
  `EMAIL` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `RUA` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `RUA_NUMERO` int(5) DEFAULT NULL,
  `CEP` varchar(8) CHARACTER SET utf8 DEFAULT NULL,
  `BAIRRO` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `CIDADE` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `COMPLEMENTO` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `ESTADO` varchar(2) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfabricante`
--

CREATE TABLE `tbfabricante` (
  `COD_FABRICANTE` int(5) NOT NULL,
  `NOME` varchar(50) NOT NULL,
  `TELEFONE` varchar(10) NOT NULL,
  `CELULAR` varchar(11) NOT NULL,
  `CNPJ` varchar(14) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `RUA` varchar(50) NOT NULL,
  `RUA_NUMERO` int(5) NOT NULL,
  `CEP` varchar(8) NOT NULL,
  `BAIRRO` varchar(30) NOT NULL,
  `CIDADE` varchar(50) NOT NULL,
  `COMPLEMENTO` varchar(100) NOT NULL,
  `ESTADO` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfornecedor`
--

CREATE TABLE `tbfornecedor` (
  `COD_FORNECEDOR` int(5) NOT NULL,
  `NOME` varchar(50) NOT NULL,
  `TELEFONE` varchar(10) NOT NULL,
  `CELULAR` varchar(11) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `RUA` varchar(50) NOT NULL,
  `RUA_NUMERO` int(5) NOT NULL,
  `CEP` varchar(8) NOT NULL,
  `BAIRRO` varchar(30) NOT NULL,
  `CIDADE` varchar(50) NOT NULL,
  `COMPLEMENTO` varchar(100) NOT NULL,
  `ESTADO` varchar(2) NOT NULL,
  `CNPJ` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfuncionario`
--

CREATE TABLE `tbfuncionario` (
  `COD_FUNCIONARIO` int(5) NOT NULL,
  `NOME_FUNCIONARIO` varchar(50) NOT NULL,
  `DATA_NASCIMENTO` date NOT NULL,
  `TELEFONE` varchar(10) NOT NULL,
  `CELULAR` varchar(11) NOT NULL,
  `CPF` varchar(13) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `RUA` varchar(50) NOT NULL,
  `RUA_NUMERO` int(5) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `BAIRRO` varchar(50) NOT NULL,
  `CIDADE` varchar(30) NOT NULL,
  `COMPLEMENTO` varchar(100) NOT NULL,
  `RG` varchar(9) NOT NULL,
  `ESTADO` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbfuncionario`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `tbgarantiafornecedor`
--

CREATE TABLE `tbgarantiafornecedor` (
  `COD_GARANTIA_FORNECEDOR` int(5) NOT NULL,
  `COD_MERCADORIA` int(5) DEFAULT NULL,
  `DATA` date NOT NULL,
  `VALOR_PAGO` float(7,2) NOT NULL,
  `NOME` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbmercadoria`
--

CREATE TABLE `tbmercadoria` (
  `COD_MERCADORIA` int(5) NOT NULL,
  `COD_FABRICANTE` int(5) DEFAULT NULL,
  `COD_FORNECEDOR` int(5) DEFAULT NULL,
  `MARCA` varchar(50) NOT NULL,
  `MODELO` varchar(50) NOT NULL,
  `CUSTO` float(7,2) NOT NULL,
  `NOME` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tborcamento`
--

CREATE TABLE `tborcamento` (
  `COD_ORCAMENTO` int(5) NOT NULL,
  `COD_MERCADORIA` int(5)NOT NULL,
  `COD_CLIENTE` int(5) NOT NULL,
  `SERVICO_SOLICITADO` varchar(200) NOT NULL,
  `DESCRICAO` varchar(200) NOT NULL,
  `DATA` date NOT NULL,
  `VALOR_MERCADORIA` float(7,2) NOT NULL,
  `VALOR_MAO_OBRA` float(7,2) NOT NULL,
  `VALOR_TOTAL` float(7,2) NOT NULL,
  `STATUS` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbpagamento`
--

CREATE TABLE `tbpagamento` (
  `COD_PAGAMENTO` int(5) NOT NULL,
  `COD_CLIENTE` int(5) NOT NULL,
  `FORMA_PAGAMENTO` varchar(50) NOT NULL,
  `DESCONTO` float(7,2) NOT NULL,
  `DATA_PAGAMENTO` datetime NOT NULL,
  `TOTAL` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbprestacaoservico`
--

CREATE TABLE `tbprestacaoservico` (
  `COD_PRESTACAO_SERVICO` int(5) NOT NULL,
  `NOME_PRESTACAO` varchar(100) NOT NULL,
  `DATA` date DEFAULT NULL,
  `VALOR_PAGO` float(7,2) NOT NULL,
  `DESCRICAO` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbsaidamercadoria`
--

CREATE TABLE `tbsaidamercadoria` (
  `COD_SAIDA_MERCADORIA` int(5) NOT NULL,
  `NOME_MERCADORIA` varchar(30) NOT NULL, 
  `MOTIVO_SAIDA` varchar(200) NOT NULL,
  `DATA_SAIDA` date NOT NULL,
  `VALOR` float(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

CREATE TABLE `tbusuario` (
  `COD_USUARIO` int(5) NOT NULL,
  `COD_FUNCIONARIO` int(5) NOT NULL,
  `LOGIN` varchar(50) NOT NULL,
  `SENHA` varchar(50) NOT NULL,
  `PERFIL` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbusuario`
--


--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbcliente`
--
ALTER TABLE `tbcliente`
  ADD PRIMARY KEY (`COD_CLIENTE`);

--
-- Indexes for table `tbfabricante`
--
ALTER TABLE `tbfabricante`
  ADD PRIMARY KEY (`COD_FABRICANTE`);

--
-- Indexes for table `tbfornecedor`
--
ALTER TABLE `tbfornecedor`
  ADD PRIMARY KEY (`COD_FORNECEDOR`);

--
-- Indexes for table `tbfuncionario`
--
ALTER TABLE `tbfuncionario`
  ADD PRIMARY KEY (`COD_FUNCIONARIO`);

--
-- Indexes for table `tbgarantiafornecedor`
--
ALTER TABLE `tbgarantiafornecedor`
  ADD PRIMARY KEY (`COD_GARANTIA_FORNECEDOR`),
  ADD KEY `FK_GARANTIAFORNECEDOR_CODMERCADORIA` (`COD_MERCADORIA`);

--
-- Indexes for table `tbmercadoria`
--
ALTER TABLE `tbmercadoria`
  ADD PRIMARY KEY (`COD_MERCADORIA`),
  ADD KEY `FK_MERCADORIA_CODFABRICANTE` (`COD_FABRICANTE`),
  ADD KEY `FK_MERCADORIA_CODFORNECEDOR` (`COD_FORNECEDOR`);

--
-- Indexes for table `tborcamento`
--
ALTER TABLE `tborcamento`
  ADD PRIMARY KEY (`COD_ORCAMENTO`),
  ADD KEY `FK_ORCAMENTO_CODCLIENTE` (`COD_CLIENTE`),
  ADD KEY `FK_ORCAMENTO_CODMERCADORIA` (`COD_MERCADORIA`);

--
-- Indexes for table `tbpagamento`
--
ALTER TABLE `tbpagamento`
  ADD PRIMARY KEY (`COD_PAGAMENTO`),
  ADD KEY `FK_PAGAMENTO_CODCLIENTE` (`COD_CLIENTE`);

--
-- Indexes for table `tbprestacaoservico`
--
ALTER TABLE `tbprestacaoservico`
  ADD PRIMARY KEY (`COD_PRESTACAO_SERVICO`);

--
-- Indexes for table `tbsaidamercadoria`
--
ALTER TABLE `tbsaidamercadoria`
  ADD PRIMARY KEY (`COD_SAIDA_MERCADORIA`);

--
-- Indexes for table `tbusuario`
--
ALTER TABLE `tbusuario`
  ADD PRIMARY KEY (`LOGIN`),
  ADD KEY `FK_USUARIO_CODFUNCIONARIO` (`COD_FUNCIONARIO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbfuncionario`
--
ALTER TABLE `tbfuncionario`
  MODIFY `COD_FUNCIONARIO` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tbgarantiafornecedor`
--
ALTER TABLE `tbgarantiafornecedor`
  MODIFY `COD_GARANTIA_FORNECEDOR` int(5) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbmercadoria`
--
ALTER TABLE `tbmercadoria`
  MODIFY `COD_MERCADORIA` int(5) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tborcamento`
--
ALTER TABLE `tborcamento`
  MODIFY `COD_ORCAMENTO` int(5) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbpagamento`
--
ALTER TABLE `tbpagamento`
  MODIFY `COD_PAGAMENTO` int(5) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbprestacaoservico`
--
ALTER TABLE `tbprestacaoservico`
  MODIFY `COD_PRESTACAO_SERVICO` int(5) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbsaidamercadoria`
--
ALTER TABLE `tbsaidamercadoria`
  MODIFY `COD_SAIDA_MERCADORIA` int(5) NOT NULL AUTO_INCREMENT;
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

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
