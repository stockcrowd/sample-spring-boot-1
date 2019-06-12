package com.sc.sample.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sc.sample.app.pojos.Pfp;

@Service
public class AppService {

	public List<Pfp> getPfps() {

		List<Pfp> pfps = new ArrayList<Pfp>();

		pfps.add(Pfp.builder().name("ADVENTUREROS, PFP, S.L.").registerNumber(14).registerDate("13/02/2017")
				.webpage("www.adventureros.es").build());
		pfps.add(Pfp.builder().name("ARBOL FINANCE, PFP, S.L.").registerNumber(13).registerDate("29/12/2016")
				.webpage("www.arboribus.com").build());
		pfps.add(Pfp.builder().name("BUSINESS DREAM FACTORY PFP, SOCIEDAD LIMITADA").registerNumber(28)
				.registerDate("24/05/2019").webpage("www.bdkapital.es").build());
		pfps.add(Pfp.builder().name("CAPITAL CELL CROWDFUNDING PLATAFORMA DE FINANCIACION PARTICIPATIVA, S.L.")
				.registerNumber(17).registerDate("17/03/2017").webpage("WWW.CAPITALCELL.NET").build());
		pfps.add(Pfp.builder().name("CIVISLEND PFP, S.A.").registerNumber(21).registerDate("06/10/2017")
				.webpage("www.civislend.com").build());
		pfps.add(Pfp.builder().name("COMPTES PERKS, PFP, S.A.").registerNumber(26).registerDate("06/07/2018")
				.webpage("www.comptesperkspfp.com").build());
		pfps.add(Pfp.builder().name("CROWDCUBE SPAIN, PLATAFORMA DE FINANCIACION PARTICIPATIVA, S.L.")
				.registerNumber(11).registerDate("25/11/2016").webpage("WWW.CROWDCUBE.ES").build());
		pfps.add(Pfp.builder().name("CROWDFUNDING BIZKAIA, PFP, S.L.").registerNumber(25).registerDate("21/05/2018")
				.webpage("www.crowdfundingbizkaia.com").build());
		pfps.add(Pfp.builder().name("CROWDHOUSE WORLDWIDE PFP, S.L.").registerNumber(22).registerDate("19/01/2018")
				.webpage("www.icrowdhouse.com").build());
		pfps.add(Pfp.builder().name("EASY FINANCING CLUB, PFP, S.L.").registerNumber(6).registerDate("21/09/2016")
				.webpage("www.excelend.com").build());
		pfps.add(Pfp.builder().name("ECROWD INVEST PLATAFORMA DE FINANCIACION PARTICIPATIVA, S.L.").registerNumber(10)
				.registerDate("21/10/2016").webpage("WWW.ECROWDINVEST.COM").build());
		pfps.add(Pfp.builder().name("EINICIA CROWDFUNDING PFP, S.L.").registerNumber(16).registerDate("13/02/2017")
				.webpage("www.einicia.es").build());
		pfps.add(Pfp.builder().name("FELLOW FUNDERS, PFP, S.A.").registerNumber(12).registerDate("02/12/2016")
				.webpage("www.fellowfunders.es").build());
		pfps.add(Pfp.builder().name("FUNDEEN SPAIN, P.F.P., S.L.").registerNumber(27).registerDate("18/02/2019")
				.webpage("https://www.fundeen.com").build());
		pfps.add(Pfp.builder().name("GROW.LY PLATAFORMA DE FINANCIACION PARTICIPATIVA, S.L.").registerNumber(7)
				.registerDate("14/10/2016").webpage("www.growly.es").build());
		pfps.add(Pfp.builder().name("HOUSERS GLOBAL PROPERTIES, PFP, S.L.").registerNumber(20)
				.registerDate("02/06/2017").webpage("www.housers.com").build());
		pfps.add(Pfp.builder().name("LA BOLSA SOCIAL, PFP, S.L").registerNumber(1).registerDate("15/12/2015")
				.webpage("https://www.bolsasocial.com/").build());
		pfps.add(Pfp.builder().name("LIGNUM CAPITAL, PFP, S.L.").registerNumber(4).registerDate("27/07/2016")
				.webpage("http://www.lignumcap.com/").build());
		pfps.add(Pfp.builder().name("MYTRIPLEA FINANCIACIÓN PFP, S.L.").registerNumber(3).registerDate("27/07/2016")
				.webpage("www.mytripleaprestamos.com").build());
		pfps.add(Pfp.builder().name("OCTOBER ESPAÑA PLATAFORMA DE FINANCIACION PARTICIPATIVA, S.L.").registerNumber(8)
				.registerDate("14/10/2016").webpage("https://es.october.eu").build());
		pfps.add(Pfp.builder()
				.name("SOCIEDAD ECONOMICA PARA EL DESARROLLO DE LA FINANCIACION ALTERNATIVA COLECTUAL PFP, S.L.")
				.registerNumber(5).registerDate("21/09/2016").webpage("www.colectual.com").build());
		pfps.add(Pfp.builder().name("SOCILEN, PFP, S.L.").registerNumber(9).registerDate("21/10/2016")
				.webpage("https://www.socilen.com/").build());
		pfps.add(Pfp.builder().name("SOCIOSINVERSORES 2010 PFP, S.L.").registerNumber(2).registerDate("15/07/2016")
				.webpage("https://www.sociosinversores.com/").build());
		pfps.add(Pfp.builder().name("STARTUPXPLORE, PFP, S.L.").registerNumber(19).registerDate("21/04/2017")
				.webpage("https://startupxplore.com").build());
		pfps.add(Pfp.builder().name("STOCKCROWD PFP, S.L.").registerNumber(24).registerDate("13/04/2018")
				.webpage("WWW.STOCKCROWD.COM").build());
		pfps.add(Pfp.builder().name("THE CROWD ANGEL, PFP, S.L.").registerNumber(18).registerDate("24/03/2017")
				.webpage("WWW.THECROWDANGEL.COM").build());
		pfps.add(Pfp.builder().name("WELCOME CAPITAL PLATAFORMA DE FINANCIACIÓN PARTICIPATIVA, S.A.").registerNumber(15)
				.registerDate("13/02/2017").webpage("www.welcomecapital.es").build());
		pfps.add(Pfp.builder().name("ZANK FINANCIAL PFP, S.L.").registerNumber(23).registerDate("23/02/2018")
				.webpage("www.zank.com.es").build());

		//System.out.println(pfps.get(0).toString());

		return pfps;
	}
}
